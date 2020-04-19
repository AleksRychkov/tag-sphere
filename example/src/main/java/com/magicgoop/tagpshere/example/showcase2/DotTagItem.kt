package com.magicgoop.tagpshere.example.showcase2

import android.graphics.Canvas
import android.text.TextPaint
import com.magicgoop.tagsphere.item.TagItem

class DotTagItem(private val radius: Float) : TagItem() {
    override fun drawSelf(
        x: Float,
        y: Float,
        canvas: Canvas,
        paint: TextPaint,
        easingFunction: ((t: Float) -> Float)?
    ) {
        val r = easingFunction?.let { calc ->
            val ease = calc(getEasingValue())
            radius * ease
        } ?: radius

        if (r > 0) {
            canvas.drawCircle(x - r / 2f, y - r / 2f, r, paint)
        }
    }
}