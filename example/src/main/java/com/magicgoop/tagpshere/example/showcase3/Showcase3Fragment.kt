package com.magicgoop.tagpshere.example.showcase3

import android.content.Intent
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.text.HtmlCompat
import androidx.fragment.app.Fragment
import com.magicgoop.tagpshere.example.R
import com.magicgoop.tagsphere.OnTagTapListener
import com.magicgoop.tagsphere.item.TagItem
import kotlinx.android.synthetic.main.fragment_showcase3.*


class Showcase3Fragment : Fragment() {
    companion object {
        fun newInstance(): Showcase3Fragment =
            Showcase3Fragment()

        val drawableResList = listOf(
            R.drawable.ic_example_1,
            R.drawable.ic_example_2,
            R.drawable.ic_example_3,
            R.drawable.ic_example_4,
            R.drawable.ic_example_5,
            R.drawable.ic_example_6,
            R.drawable.ic_example_7,
            R.drawable.ic_example_8,
            R.drawable.ic_example_9,
            R.drawable.ic_example_10,
            R.drawable.ic_example_11,
            R.drawable.ic_example_12,
            R.drawable.ic_example_13,
            R.drawable.ic_example_14,
            R.drawable.ic_example_15,
            R.drawable.ic_example_16,
            R.drawable.ic_example_17,
            R.drawable.ic_example_18,
            R.drawable.ic_example_19,
            R.drawable.ic_example_20,
            R.drawable.ic_example_21,
            R.drawable.ic_example_22,
            R.drawable.ic_example_23,
            R.drawable.ic_example_24,
            R.drawable.ic_example_25
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_showcase3, container, false);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initLicenseText()
        initTagView()
    }

    private fun initTagView() {
        val tags = mutableListOf<VectorDrawableTagItem>()
        drawableResList.forEach { id ->
            getVectorDrawable(id)?.let {
                tags.add(VectorDrawableTagItem(it))
            }
        }
        tagSphereView.addTagList(tags)
        tagSphereView.setRadius(2.75f)
        tagSphereView.setOnTagTapListener(object : OnTagTapListener {
            override fun onTap(tagItem: TagItem) {
                Toast.makeText(requireContext(), "Stay calm and don't get sick", Toast.LENGTH_SHORT)
                    .show()
            }
        })
    }

    private fun getVectorDrawable(id: Int): Drawable? =
        ContextCompat.getDrawable(requireContext(), id)

    private fun initLicenseText() {
        tvLicense.text = HtmlCompat.fromHtml(
            resources.getString(R.string.icons_made_by_freepik),
            HtmlCompat.FROM_HTML_MODE_LEGACY
        )
        tvLicense.movementMethod = LinkMovementMethod.getInstance()
        tvLicense.setOnClickListener {
            val intent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flaticon.com/authors/freepik"))
            requireActivity().packageManager?.let {
                intent.resolveActivity(it)?.let {
                    requireActivity().startActivity(intent)
                }
            }
        }
    }
}