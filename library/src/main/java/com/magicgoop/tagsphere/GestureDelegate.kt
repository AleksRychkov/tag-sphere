package com.magicgoop.tagsphere

import android.content.Context
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.VelocityTracker
import android.view.ViewConfiguration
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.sqrt

internal class GestureDelegate(context: Context, private val gestureListener: OnGestureListener) {

    private var lastTouchX = 0f
    private var lastTouchY = 0f
    private var isDragging: Boolean = false
    private var velocityTracker: VelocityTracker? = null
    private var minimumVelocity: Int
    private var touchSlop: Int
    private var dx: Float = 0f
    private var dy: Float = 0f

    private val singleTapGesture = GestureDetector(context, SingleTapGesture())

    init {
        with(ViewConfiguration.get(context)) {
            touchSlop = scaledTouchSlop
            minimumVelocity = scaledMinimumFlingVelocity
        }
    }

    fun onTouchEvent(event: MotionEvent?): Boolean {
        return try {
            event?.let {
                processTouchEvent(event)
            } ?: true
        } catch (e: IllegalArgumentException) {
            true
        }
    }

    private fun processTouchEvent(ev: MotionEvent): Boolean {
        val action = ev.action
        if (ev.pointerCount > 1) return true
        singleTapGesture.onTouchEvent(ev)
        when (action and MotionEvent.ACTION_MASK) {
            MotionEvent.ACTION_DOWN -> {
                lastTouchX = ev.x
                lastTouchY = ev.y
                dx = 0f
                dy = 0f
                isDragging = false
                velocityTracker = VelocityTracker.obtain()
                velocityTracker?.run { addMovement(ev) }
                gestureListener.cancel()
            }
            MotionEvent.ACTION_MOVE -> {
                val x: Float = ev.x
                val y: Float = ev.y
                val dx: Float = x - lastTouchX
                val dy: Float = y - lastTouchY
                if (!isDragging) {
                    isDragging = sqrt(dx * dx + dy * dy) >= touchSlop
                }

                if (isDragging) {
                    this.dx = dx
                    this.dy = dy
                    lastTouchX = x
                    lastTouchY = y
                    velocityTracker?.run { addMovement(ev) }
                    gestureListener.onDeltaChanged(dx, dy)
                }
            }
            MotionEvent.ACTION_CANCEL -> {
                velocityTracker?.run { recycle() }
                velocityTracker = null
                if (isDragging) {
                    dx = 0f
                    dy = 0f
                    isDragging = false
                    gestureListener.onDeltaChanged(dx, dy)
                }
            }
            MotionEvent.ACTION_UP -> {
                if (isDragging) {
                    dx = 0f
                    dy = 0f
                    isDragging = false
                    gestureListener.onDeltaChanged(dx, dy)
                    velocityTracker?.let {
                        lastTouchX = ev.x
                        lastTouchY = ev.y
                        it.addMovement(ev)
                        it.computeCurrentVelocity(1000)
                        val vX = it.xVelocity
                        val vY = it.yVelocity

                        if (max(abs(vX), abs(vY)) >= minimumVelocity) {
                            gestureListener.onFling(vX, vY)
                        }
                    }
                }
                velocityTracker?.run { recycle() }
                velocityTracker = null
            }
        }
        return true
    }

    inner class SingleTapGesture : GestureDetector.SimpleOnGestureListener() {
        override fun onSingleTapUp(e: MotionEvent?): Boolean {
            e?.let {
                gestureListener.onSingleTap(it.x, it.y)
                return true
            } ?: return super.onSingleTapConfirmed(e)
        }

        override fun onLongPress(e: MotionEvent?) {
            e?.let {
                gestureListener.onLongPressed(it.x, it.y)
            }
        }
    }
}