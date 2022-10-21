package com.example.viewpagertest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpagertest1.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
	val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)


		val fragmentList = listOf(AFragment(), BFragment(), CFragment(), DFragment())
		val adapter = FragmentAdapter(this)
		adapter.fragmentList = fragmentList

		binding.viewPager.adapter = adapter

		val tabTitles = listOf<String>("A", "B", "C", "D")

		TabLayoutMediator(binding.tabLayout, binding.viewPager){ tab, i->
			tab.text = tabTitles[i]
		}.attach()
	}
}