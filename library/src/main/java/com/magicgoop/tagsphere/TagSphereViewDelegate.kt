package com.magicgoop.tagsphere

import android.animation.PointFEvaluator
import android.animation.ValueAnimator
import android.annotation.SuppressLint
import android.graphics.*
import android.os.Handler
import android.text.TextPaint
import android.view.MotionEvent
import android.view.View
import android.view.animation.DecelerateInterpolator
import com.magicgoop.tagsphere.item.TagItem
import com.magicgoop.tagsphere.utils.EasingFunction
import kotlin.math.max
import kotlin.math.min
import kotlin.math.sqrt

@SuppressLint("ClickableViewAccessibility")
internal class TagSphereViewDelegate constructor(
    private val view: View
) : View.OnTouchListener {

    companion object {
        const val DEFAULT_RADIUS = 2.5f
        const val DEFAULT_SENSITIVITY = 10
    }

    var easingFunction: ((t: Float) -> Float)? = { EasingFunction.easeOutExpo(it) }
        set(value) {
            field = value
            view.postInvalidateOnAnimation()
        }
    var rotateOnTouch: Boolean = true
    var radius: Float = DEFAULT_RADIUS
        set(value) {
            if (value in 1f..10f) {
                field = value
                updateSphere()
            }
        }
    var sensitivity: Int = DEFAULT_SENSITIVITY
        set(value) {
            if (value in 1..100) {
                radians = (Math.PI / 90f / sensitivity).toFloat()
                field = value
            }
        }

    var textPaint = TextPaint().apply {
        isAntiAlias = true
        style = Paint.Style.FILL
        color = Color.BLACK
        textSize = paintTextSize
    }
        set(value) {
            value.textAlign = Paint.Align.CENTER
            paintTextSize = value.textSize
            field = value
            view.invalidate()
        }

    private val adapter: TagAdapter = TagAdapter()
    private var onLongPressedListener: OnTagLongPressedListener? = null
    private var onTapListener: OnTagTapListener? = null

    private var radians: Float = (Math.PI / 90f / sensitivity).toFloat()
    private var flingAnimator: ValueAnimator? = null

    private var paintTextSize = 30f
    private var projectionDistance: Float = 0f
    private var sphereRadius = Float.MIN_VALUE
    private val viewCenter = PointF()

    private val handler = Handler()

    private val gestureListener: OnGestureListener = object : OnGestureListener {
        override fun cancel() {
            cancelFlingAnim()
        }

        override fun onDeltaChanged(deltaX: Float, deltaY: Float) {
            adapter.getTags().forEach { tag ->
                tag.run {
                    rotateY(deltaX * radians)
                    rotateX(deltaY * radians)
                    updateProjectionX(width / 2f, radius, projectionDistance, padding.left)
                    updateProjectionY(height / 2f, radius, projectionDistance, padding.top)
                    maybeUpdateSphereRadius(getProjectionX(), getProjectionY())
                }
            }
            adapter.getTags().sort()
            view.postInvalidateOnAnimation()
        }

        override fun onFling(velocityX: Float, velocityY: Float) {
            startFling(velocityX, velocityY)
        }

        override fun onSingleTap(posX: Float, posY: Float) {
            if (isInsideProjection(posX, posY)) {
                adapter.getTagByProjectionPoint(posX - padding.left, posY - padding.top)?.let {
                    onTapListener?.onTap(it)
                }
            }
        }

        override fun onLongPressed(posX: Float, posY: Float) {
            adapter.getTagByProjectionPoint(posX - padding.left, posY - padding.top)?.let {
                onLongPressedListener?.onLongPressed(it)
            }
        }
    }
    private val gestureDelegate: GestureDelegate

    private var width: Float = 0f
    private var height: Float = 0f
    private var padding: Rect = Rect()

    init {
        view.setOnTouchListener(this)
        gestureDelegate = GestureDelegate(view.context, gestureListener)
    }

    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        if (event != null && event.action and MotionEvent.ACTION_MASK == MotionEvent.ACTION_DOWN) {
            v?.parent?.requestDisallowInterceptTouchEvent(true)
        }
        return if (rotateOnTouch)
            gestureDelegate.onTouchEvent(event)
        else view.onTouchEvent(event)
    }

    fun updateViewSize() {
        padding.left = view.paddingLeft
        padding.right = view.paddingRight
        padding.top = view.paddingTop
        padding.bottom = view.paddingBottom
        this.width = view.width.toFloat() - padding.left - padding.right
        this.height = view.height.toFloat() - padding.top - padding.bottom
        viewCenter.x = width / 2f + padding.left
        viewCenter.y = height / 2f + padding.top
        projectionDistance = min(width, height)
        updateSphere()
    }

    fun onDraw(canvas: Canvas) {
        adapter.getTags().forEach { tag ->
            val x = tag.getProjectionX()
            val y = tag.getProjectionY()
            if (x >= 0 && x < view.width + paintTextSize && y >= 0 && y < view.height + paintTextSize) {
                tag.drawSelf(x, y, canvas, textPaint, easingFunction)
            }
        }
    }

    fun addTagItem(tag: TagItem) {
        adapter.addTag(tag)
        updateSphere()
    }

    fun addTagItems(list: List<TagItem>) {
        adapter.addTagList(list)
        updateSphere()
    }

    fun removeTagItem(tag: TagItem) {
        adapter.removeTag(tag)
        updateSphere()
    }

    fun clearAllTags() {
        adapter.clearAll()
        updateSphere()
    }

    fun startFling(vX: Float, vY: Float) {
        cancelFlingAnim()
        flingAnimator =
            ValueAnimator.ofObject(PointFEvaluator(), PointF(vX / 100, vY / 100), PointF(0f, 0f))
                .apply {
                    duration = 1000
                    addUpdateListener {
                        (it.animatedValue as PointF).run {
                            gestureListener.onDeltaChanged(x, y)
                        }
                    }
                    interpolator = DecelerateInterpolator()
                }
        flingAnimator?.start()
    }

    fun setLongPressedListener(listener: OnTagLongPressedListener?) {
        onLongPressedListener = listener
    }

    fun setOnTapListener(listener: OnTagTapListener?) {
        onTapListener = listener
    }

    private fun cancelFlingAnim() {
        flingAnimator?.cancel()
    }

    fun startAnimation(deltaX: Float, deltaY: Float) {
        val delay = 1000 / 60L
        handler.postDelayed(object : Runnable {
            override fun run() {
                gestureListener.onDeltaChanged(deltaX, -deltaY)
                handler.postDelayed(this, delay)
            }

        }, delay)
    }

    fun stopAnimation() {
        handler.removeCallbacksAndMessages(null)
    }

    private fun maybeUpdateSphereRadius(x: Float, y: Float) {
        sphereRadius = max(sphereRadius, x - viewCenter.x)
        sphereRadius = max(sphereRadius, y - viewCenter.y)
    }

    private fun isInsideProjection(posX: Float, posY: Float): Boolean {
        val dx = viewCenter.x - posX
        val dy = viewCenter.y - posY
        return sqrt(dx * dx + dy * dy) <= sphereRadius + paintTextSize
    }

    private fun updateSphere() {
        gestureListener.onDeltaChanged(0f, 0f)
    }
}