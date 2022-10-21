package com.example.viewpagertest1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
	var fragmentList = listOf<Fragment>()		// 탭으로 보여줄 프래그먼트들의 리스트
	// 탭 메뉴로 사용할 것이기 때문에 거의 변화가 없을 것이기 때문에 mutableListOf()가 아닌 listOf()로 작업함
	
	override fun getItemCount(): Int {
		return fragmentList.size
		// 프래그먼트의 개수(페이지 수)
	}

	override fun createFragment(position: Int): Fragment {
		return fragmentList.get(position)
		// position에 해당하는 특정 프래그먼트를 fragmentList에서 추출하여 리턴
	}
}