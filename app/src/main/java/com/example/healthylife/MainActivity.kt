package com.example.healthylife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.healthylife.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val tapImgArr = arrayListOf<Int>(R.drawable.ic_calendar, R.drawable.ic_home, R.drawable.ic_user)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initLayout()
    }
    
    private fun initLayout(){
        binding.viewPager.adapter = FragmentPagerAdapter(this)
        TabLayoutMediator(binding.tabLayout, binding.viewPager){ tab, pos ->
            tab.setIcon(tapImgArr[pos])
        }.attach()
    }
}