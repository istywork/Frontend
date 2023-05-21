package com.example.dongsan2mong

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class WishlistViewPagerAdapter(fragmentActivity: FragmentActivity)
    : FragmentStateAdapter(fragmentActivity){
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return LatesthomeFragment()
            1 -> return DibshomeFragment()
            2 -> return CallfreesetFragment()
            else -> return LatesthomeFragment()
        }
    }
}