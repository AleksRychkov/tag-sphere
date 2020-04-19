package com.magicgoop.tagsphere.utils

import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.sin

object EasingFunction {

    fun easeOut(t: Float): Float =
        sin(t * Math.PI * 0.5f).toFloat()

    fun easeIn(t: Float): Float =
        1f - cos(t * Math.PI * 0.5f).toFloat()

    fun easeInExpo(t: Float): Float =
        2f.pow(10 * (t - 1))

    fun easeOutExpo(t: Float): Float =
        when (t) {
            1f -> 1f
            0f -> 0f
            else -> (-1f * 2.0.pow(-10.0 * t) + 1f).toFloat()
        }

    fun inQuint(t: Float): Float =
        t * t * t * t * t

    fun outQuint(t: Float): Float {
        val tmp = t - 1
        return tmp * tmp * tmp * tmp * tmp + 1
    }

}