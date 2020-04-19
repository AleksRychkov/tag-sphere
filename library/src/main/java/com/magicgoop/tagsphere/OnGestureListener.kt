package com.magicgoop.tagsphere

interface OnGestureListener {
    fun cancel()
    fun onDeltaChanged(deltaX: Float, deltaY: Float)
    fun onFling(velocityX: Float, velocityY: Float)
    fun onSingleTap(posX: Float, posY: Float)
    fun onLongPressed(posX: Float, posY: Float)
}