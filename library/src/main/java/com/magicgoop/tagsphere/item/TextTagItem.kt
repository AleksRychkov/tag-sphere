package com.magicgoop.tagsphere.item

import android.graphics.Canvas
import android.graphics.Rect
import android.text.TextPaint
import kotlin.math.max
import kotlin.math.min
import kotlin.math.roundToInt

class TextTagItem(
    val text: String
) : TagItem() {
    private var firstInit: Boolean = false
    private var rect: Rect = Rect()

    override fun drawSelf(
        x: Float,
        y: Float,
        canvas: Canvas,
        paint: TextPaint,
        easingFunction: ((t: Float) -> Float)?
    ) {
        if (!firstInit) {
            paint.getTextBounds(text, 0, text.length, rect)
            firstInit = true
        }
        easingFunction?.let { calc ->
            val ease = calc(getEasingValue())
            val alpha = if (!ease.isNaN()) max(0, min(255, (255 * ease).roundToInt())) else 0
            paint.alpha = alpha
        } ?: run { paint.alpha = 255 }
        if (paint.alpha > 0) {
            canvas.drawText(
                text,
                x,
                y + rect.height() / 2f - rect.bottom,
                paint
            )
        }
    }
}