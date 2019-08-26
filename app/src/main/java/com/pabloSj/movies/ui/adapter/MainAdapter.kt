package com.pabloSj.movies.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.pabloSj.movies.ui.categories.PopularFragment
import com.pabloSj.movies.ui.categories.RatedFragment
import com.pabloSj.movies.ui.categories.UpcomingFragment

@Suppress("DEPRECATION")
class MainAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> PopularFragment()
            1 -> RatedFragment()
            else -> UpcomingFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Popular"
            1 -> "Top Rated"
            else -> "Upcoming"
        }
    }
}