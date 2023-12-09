package com.example.myapplication.Tab.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.Tab.WisFragment
import com.example.myapplication.Tab.RenFragment
import com.example.myapplication.Tab.HomFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {

        return when (position) {
            0 -> {
                HomFragment()
            }

            1 -> {
                WisFragment()
            }

            2 -> {
                RenFragment()
            }

            else -> {
                Fragment()
            }
        }
    }
}