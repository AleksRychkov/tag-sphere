package com.magicgoop.tagsphere

import com.magicgoop.tagsphere.item.TagItem

interface OnTagLongPressedListener {
    fun onLongPressed(tagItem: TagItem)
}