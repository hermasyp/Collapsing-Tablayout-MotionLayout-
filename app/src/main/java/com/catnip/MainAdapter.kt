package com.catnip

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.catnip.motionlayouttablayoutexample.ItemFragment
import java.lang.IllegalArgumentException

class MainAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return ItemFragment()
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "One"
            1 -> "Two"
            2 -> "Three"
            else -> throw IllegalArgumentException("Impossible")
        }
    }
}
