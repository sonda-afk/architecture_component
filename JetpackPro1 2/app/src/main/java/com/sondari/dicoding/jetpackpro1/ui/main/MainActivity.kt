package com.sondari.dicoding.jetpackpro1.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.sondari.dicoding.jetpackpro1.R
import com.sondari.dicoding.jetpackpro1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val TAB_TITLES = intArrayOf(R.string.movies, R.string.tv_show)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val setViewPager = SectionPagerAdapter(this)

        val viewPager: ViewPager2 = this.binding.viewPager
        viewPager.adapter = setViewPager
        val tabs: TabLayout = binding.tabs
        TabLayoutMediator(tabs, viewPager) { tab, position ->
            this.run {
                tab.text = resources.getString(TAB_TITLES[position])
            }
        }.attach()
    }

}