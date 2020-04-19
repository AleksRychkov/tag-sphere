package com.magicgoop.tagsphere

import com.magicgoop.tagsphere.item.TagItem
import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt

internal class TagAdapter {

    private val tagList: MutableList<TagItem> = mutableListOf()

    private fun addPoint(i: Int, size: Int, tagItem: TagItem) {
        recalculate(i, size, tagItem)
        tagList.add(tagItem)
    }

    private fun recalculate(i: Int, size: Int, tagItem: TagItem) {
        val offset: Float = 2f / size
        val increment = Math.PI * (3f - sqrt(5f))
        val y = ((i * offset) - 1) + (offset / 2);
        val r = sqrt(1 - y.pow(2))
        val phi = (i % size) * increment
        val x = cos(phi) * r
        val z = sin(phi) * r
        tagItem.setPointValues(x.toFloat(), y, z.toFloat())
    }

    fun addTag(tagItem: TagItem) {
        val size = tagList.size
        tagList.forEachIndexed { index, tag ->
            recalculate(index, size, tag)
        }
        addPoint(size, size + 1, tagItem)
    }

    fun removeTag(tagItem: TagItem) {
        if (tagList.remove(tagItem)) {
            val size = tagList.size
            tagList.forEachIndexed { index, tag ->
                recalculate(index, size, tag)
            }
        }
    }

    fun addTagList(list: List<TagItem>) {
        val size = list.size
        list.forEachIndexed { index, tagItem ->
            addPoint(index, size, tagItem)
        }
    }

    fun clearAll() {
        tagList.clear()
    }

    fun getTags(): MutableList<TagItem> = tagList

    fun getTagByProjectionPoint(x: Float, y: Float): TagItem? =
        tagList.filter { it.isTagInFront() }.minBy { it.projectionDistanceTo(x, y) }

}