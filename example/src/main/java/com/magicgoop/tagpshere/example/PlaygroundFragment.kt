package com.magicgoop.tagpshere.example

import android.os.Bundle
import android.text.TextPaint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.magicgoop.tagpshere.example.util.CustomOnSeekBarChangeListener
import com.magicgoop.tagpshere.example.util.EmojiConstants
import com.magicgoop.tagsphere.OnTagLongPressedListener
import com.magicgoop.tagsphere.OnTagTapListener
import com.magicgoop.tagsphere.item.TagItem
import com.magicgoop.tagsphere.item.TextTagItem
import com.magicgoop.tagsphere.utils.EasingFunction
import kotlinx.android.synthetic.main.fragment_playground.*
import kotlin.random.Random

class PlaygroundFragment : Fragment(), OnTagLongPressedListener, OnTagTapListener {

    companion object {
        fun newInstance(): PlaygroundFragment = PlaygroundFragment()

        private const val MIN_SENSITIVITY = 1
        private const val MIN_RADIUS = 10f
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_playground, container, false);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initTagView()
        initSettings()
    }

    private fun initTagView() {
        val samples = EmojiConstants.emojiCodePoints.size - 1
        tagView.setTextPaint(
            TextPaint().apply {
                isAntiAlias = true
                textSize = resources.getDimension(R.dimen.tag_text_size)
            }
        )
        (0..100).map {
            TextTagItem(
                text = String(
                    Character.toChars(EmojiConstants.emojiCodePoints[Random.nextInt(samples)])
                )
            )
        }.toList().let {
            tagView.addTagList(it)
        }
        tagView.setOnLongPressedListener(this)
        tagView.setOnTagTapListener(this)
    }

    private fun initSettings() {
        sbRadius.setOnSeekBarChangeListener(object : CustomOnSeekBarChangeListener() {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                tagView.setRadius((progress + MIN_RADIUS) / 10f)
            }
        })
        sbTouchSensitivity.setOnSeekBarChangeListener(object : CustomOnSeekBarChangeListener() {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                tagView.setTouchSensitivity(progress + MIN_SENSITIVITY)
            }
        })
        cbRotateOnTouch.setOnCheckedChangeListener { _, isChecked ->
            tagView.rotateOnTouch(isChecked)
            if (isChecked) {
                cbAutoRotate.isChecked = false
                tagView.stopAutoRotation()
            }
        }
        cbAutoRotate.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                cbRotateOnTouch.isChecked = false
                val multiplier = Random.nextInt(1, 5)
                tagView.startAutoRotation(
                    Random.nextFloat() * multiplier,
                    -Random.nextFloat() * multiplier
                )
            } else {
                cbRotateOnTouch.isChecked = true
            }
        }


        rgEasingFunctions.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.rbEaseInExpo -> tagView.setEasingFunction { EasingFunction.easeInExpo(it) }
                R.id.rbEaseOutExpo -> tagView.setEasingFunction { EasingFunction.easeOutExpo(it) }
                R.id.rbCustom -> tagView.setEasingFunction { t -> 1f - t * t * t * t * t }
                else -> tagView.setEasingFunction(null)

            }
        }
    }

    override fun onLongPressed(tagItem: TagItem) {
        Snackbar
            .make(root, "onLongPressed: " + (tagItem as TextTagItem).text, Snackbar.LENGTH_LONG)
            .setAction("Delete tag") { tagView.removeTag(tagItem) }
            .show()
    }

    override fun onTap(tagItem: TagItem) {
        Snackbar
            .make(root, "onTap: " + (tagItem as TextTagItem).text, Snackbar.LENGTH_SHORT)
            .show()
    }
}