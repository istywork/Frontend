package com.example.dongsan2mong

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.example.dongsan2mong.databinding.ActivityMainBinding
import com.example.dongsan2mong.databinding.ActivitySidemenudrawerBinding
import com.example.dongsan2mong.databinding.FragmentMapBinding

class MapFragment : Fragment() {
    lateinit var binding: FragmentMapBinding
    lateinit var bindingMain: ActivityMainBinding
    lateinit var bindingSide: ActivitySidemenudrawerBinding
    lateinit var imgViewForOpen: ImageView
    lateinit var imgViewForClose: ImageView
    lateinit var drawerView: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bindingMain = ActivityMainBinding.inflate(inflater, container, false)
        bindingSide = ActivitySidemenudrawerBinding.inflate(inflater, container, false)
        binding = FragmentMapBinding.inflate(inflater, container, false)
        imgViewForOpen = binding.sidemenuBtn
        imgViewForClose = bindingSide.closeBtn
        drawerView = bindingSide.sidemenuDrawer
        init()
        return binding.root
    }

    private fun init() {
        imgViewForOpen.setOnClickListener {
            bindingMain.drawerLayout.openDrawer(GravityCompat.END)
            println("사이드 메뉴 열기 버튼 온클릭리스너 호출")
        }
        imgViewForClose.setOnClickListener {
            bindingMain.drawerLayout.closeDrawer(drawerView)
            println("사이드 메뉴 닫기 버튼 온클릭리스너 호출")
        }
    }
}