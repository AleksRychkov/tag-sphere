package com.magicgoop.tagpshere.example

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.magicgoop.tagpshere.example.showcase1.Showcase1Fragment
import com.magicgoop.tagpshere.example.showcase2.Showcase2Fragment
import com.magicgoop.tagpshere.example.showcase3.Showcase3Fragment

class ExampleFragmentPagerAdapter(
    fm: FragmentManager
) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val tabTitles =
        arrayOf("Playground", "Showcase1", "Showcase2", "Showcase3")

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> PlaygroundFragment.newInstance()
            1 -> Showcase1Fragment.newInstance()
            2 -> Showcase2Fragment.newInstance()
            3 -> Showcase3Fragment.newInstance()
            else -> PlaygroundFragment.newInstance()
        }
    }

    override fun getCount(): Int = tabTitles.size

    override fun getPageTitle(position: Int): CharSequence? {
        return tabTitles[position]
    }
}