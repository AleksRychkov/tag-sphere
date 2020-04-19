package com.magicgoop.tagsphere

import android.content.Context
import android.graphics.Canvas
import android.text.TextPaint
import android.util.AttributeSet
import android.view.View
import com.magicgoop.tagsphere.TagSphereViewDelegate.Companion.DEFAULT_RADIUS
import com.magicgoop.tagsphere.TagSphereViewDelegate.Companion.DEFAULT_SENSITIVITY
import com.magicgoop.tagsphere.item.TagItem
import com.magicgoop.tagsphere.utils.EasingFunction

class TagSphereView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val viewDelegate: TagSphereViewDelegate = TagSphereViewDelegate(this)

    init {
        if (!isInEditMode) {
            setLayerType(LAYER_TYPE_HARDWARE, null)
        }
        context.theme.obtainStyledAttributes(
            attrs, R.styleable.TagSphereView, 0, 0
        ).apply {
            try {
                viewDelegate.sensitivity =
                    getInteger(R.styleable.TagSphereView_touchSensitivity, DEFAULT_SENSITIVITY)
                viewDelegate.rotateOnTouch =
                    getBoolean(R.styleable.TagSphereView_rotateOnTouch, true)
                viewDelegate.radius = getFloat(R.styleable.TagSphereView_radius, DEFAULT_RADIUS)
                getInt(R.styleable.TagSphereView_easingFunction, -1).let {
                    if (it >= 0) setEasingFunctionFromAttrs(it)
                }
            } finally {
                recycle()
            }
        }
    }

    override fun onDraw(c: Canvas?) {
        super.onDraw(c)
        if (isAttachedToWindow) {
            c?.let { viewDelegate.onDraw(it) }
        }
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        viewDelegate.updateViewSize()
    }

    override fun onDetachedFromWindow() {
        stopAutoRotation()
        super.onDetachedFromWindow()
    }

    fun addTag(tagItem: TagItem) {
        viewDelegate.addTagItem(tagItem)
    }

    fun addTagList(list: List<TagItem>) {
        viewDelegate.addTagItems(list)
    }

    fun removeTag(tagItem: TagItem) {
        viewDelegate.removeTagItem(tagItem)
    }

    fun clearAllTags() {
        viewDelegate.clearAllTags()
    }

    fun setOnLongPressedListener(onTagLongPressedListener: OnTagLongPressedListener?) {
        viewDelegate.setLongPressedListener(onTagLongPressedListener)
    }

    fun setOnTagTapListener(onTagTapListener: OnTagTapListener?) {
        viewDelegate.setOnTapListener(onTagTapListener)
    }

    fun setTouchSensitivity(sensitivity: Int) {
        viewDelegate.sensitivity = sensitivity
    }

    fun setRadius(radius: Float) {
        viewDelegate.radius = radius
    }

    fun rotateOnTouch(rotateOnTouch: Boolean) {
        viewDelegate.rotateOnTouch = rotateOnTouch
    }

    fun setEasingFunction(function: ((Float) -> Float)?) {
        viewDelegate.easingFunction = function
    }

    fun setTextPaint(textPaint: TextPaint) {
        viewDelegate.textPaint = textPaint
    }

    fun startAutoRotation(deltaX: Float = 1f, deltaY: Float = 1f) {
        viewDelegate.startAnimation(deltaX, deltaY)
    }

    fun stopAutoRotation() {
        viewDelegate.stopAnimation()
    }

    private fun setEasingFunctionFromAttrs(value: Int) {
        when (value) {
            0 -> setEasingFunction { EasingFunction.easeIn(it) }
            1 -> setEasingFunction { EasingFunction.easeOut(it) }
            2 -> setEasingFunction { EasingFunction.easeInExpo(it) }
            3 -> setEasingFunction { EasingFunction.easeOutExpo(it) }
            4 -> setEasingFunction { EasingFunction.inQuint(it) }
            5 -> setEasingFunction { EasingFunction.outQuint(it) }
            6 -> setEasingFunction(null)
        }
    }
}