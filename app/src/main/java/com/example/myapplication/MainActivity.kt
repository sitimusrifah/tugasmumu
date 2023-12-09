package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.Tab.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout = findViewById<TabLayout>(R.id.tl1)
        val viewPager2 = findViewById<ViewPager2>(R.id.pg1)


        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)

        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Home"
                }

                1 -> {
                    tab.text = "Wisata"
                }

                2 -> {
                    tab.text = "Rencana"
                }
            }
        }.attach()

        val btn1 = findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            finish()
        }
        val btn2: Button = findViewById(R.id.btn2)
        btn2.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id){
                R.id.btn2 ->{
                    val gantiIntent = Intent(this, ProfileActivity::class.java)
                    startActivity(gantiIntent)
                }

            }
        }
    }
}