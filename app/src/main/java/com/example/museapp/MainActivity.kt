package com.example.museapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tablayout)
        viewPager = findViewById(R.id.viewpager)

        val vpAdapter = VPAdapter(this)
        vpAdapter.addFragment(BlankFragment1(), "Activities")
        vpAdapter.addFragment(BlankFragment2(), "Reminders")
        vpAdapter.addFragment(BlankFragment3(), "Data")
        viewPager.adapter = vpAdapter

        // Link TabLayout with ViewPager2
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = vpAdapter.getFragmentTitle(position)
        }.attach()
    }
}

