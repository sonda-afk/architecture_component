package com.sondari.dicoding.jetpackpro1.ui.main

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.sondari.dicoding.jetpackpro1.ui.movie.MovieFragment
import com.sondari.dicoding.jetpackpro1.ui.tv.TvShowFragment

class SectionPagerAdapter(fragmentActivity: AppCompatActivity) :
    FragmentStateAdapter(fragmentActivity){

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = MovieFragment()
            1 -> fragment = TvShowFragment()
        }
        return fragment as Fragment
    }

    override fun getItemCount(): Int = 2
}