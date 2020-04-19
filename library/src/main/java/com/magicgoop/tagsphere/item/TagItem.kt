package com.magicgoop.tagsphere.item

import android.graphics.Canvas
import android.graphics.PointF
import android.text.TextPaint
import com.magicgoop.tagsphere.Point3d
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt

abstract class TagItem : Comparable<TagItem> {

    private val point: Point3d = Point3d(0f, 0f, 0f)
    private val projectionPoint = PointF()

    fun rotateX(radians: Float) {
        val y = point.y
        point.y = ((y * cos(radians)) + (point.z * sin(radians) * -1.0f))
        point.z = ((y * sin(radians)) + (point.z * cos(radians)))
    }

    fun rotateY(radians: Float) {
        val x = point.x
        point.x = (x * cos(radians)) + (point.z * sin(radians) * -1.0f)
        point.z = (x * sin(radians)) + (point.z * cos(radians))
    }

    fun rotateZ(radians: Float) {
        val x = point.x
        point.x = (x * cos(radians)) + (point.y * sin(radians) * -1.0f)
        point.y = (x * sin(radians)) + (point.y * cos(radians))
    }

    fun updateProjectionX(xyOffset: Float, zOffset: Float, distance: Float, padding: Int) {
        projectionPoint.x = ((distance * point.x) / (point.z - zOffset)) + xyOffset + padding
    }

    fun updateProjectionY(xyOffset: Float, zOffset: Float, distance: Float, padding: Int) {
        projectionPoint.y = ((distance * point.y) / (point.z - zOffset)) + xyOffset + padding
    }

    fun getProjectionX() = projectionPoint.x
    fun getProjectionY() = projectionPoint.y

    open fun drawSelf(
        x: Float,
        y: Float,
        canvas: Canvas,
        paint: TextPaint,
        easingFunction: ((t: Float) -> Float)? = null
    ) {
    }

    fun setPointValues(x: Float, y: Float, z: Float) {
        point.x = x
        point.y = y
        point.z = z
    }

    fun isTagInFront() = point.z > 0

    fun projectionDistanceTo(toX: Float, toY: Float): Float {
        val dx = toX - projectionPoint.x
        val dy = toY - projectionPoint.y
        return sqrt(dx * dx + dy * dy)
    }

    fun getEasingValue() = (point.z + 1f) / 2f

    final override fun compareTo(other: TagItem): Int {
        return when {
            point.z > other.point.z -> 1
            point.z < other.point.z -> -1
            else -> 0
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as TagItem
        if (point != other.point) return false
        return true
    }

    override fun hashCode(): Int {
        return point.hashCode()
    }
}