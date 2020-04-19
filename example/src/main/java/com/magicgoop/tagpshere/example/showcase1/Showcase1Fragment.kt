package com.magicgoop.tagpshere.example.showcase1

import android.graphics.Color
import android.os.Bundle
import android.text.TextPaint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.magicgoop.tagpshere.example.R
import com.magicgoop.tagpshere.example.util.LoremIpsum
import com.magicgoop.tagsphere.OnTagTapListener
import com.magicgoop.tagsphere.item.TagItem
import com.magicgoop.tagsphere.item.TextTagItem
import kotlinx.android.synthetic.main.fragment_showcase1.*
import kotlin.random.Random

class Showcase1Fragment : Fragment() {
    companion object {
        fun newInstance(): Showcase1Fragment =
            Showcase1Fragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_showcase1, container, false);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initTagView()
    }

    private fun initTagView() {
        tagSphereView.setTextPaint(
            TextPaint().apply {
                isAntiAlias = true
                textSize = resources.getDimension(R.dimen.tag_text_size)
                color = Color.DKGRAY
            }
        )
        val loremSize = LoremIpsum.list.size
        (0..40).map {
            TextTagItem(text = LoremIpsum.list[Random.nextInt(loremSize)])
        }.toList().let {
            tagSphereView.addTagList(it)
        }
        tagSphereView.setRadius(3f)
        tagSphereView.setOnTagTapListener(object : OnTagTapListener {
            override fun onTap(tagItem: TagItem) {
                Toast.makeText(
                    requireContext(),
                    "On tap: ${(tagItem as TextTagItem).text}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
    }
}