package com.example.dongsan2mong

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.dongsan2mong.databinding.FragmentMapBinding

class MapFragment : Fragment() {
    lateinit var binding: FragmentMapBinding
    lateinit var drawerOpenImageView: ImageView
    lateinit var drawerCloseImageView: ImageView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMapBinding.inflate(inflater, container, false)
        init()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        drawerOpenImageView = view.findViewById(R.id.sidemenuBtn)
        drawerCloseImageView = activity?.findViewById(R.id.closeBtn) ?: return
        drawerOpenImageView.setOnClickListener {
            val mainActivity = activity as? MainActivity
            mainActivity?.openDrawer()
        }

        drawerCloseImageView.setOnClickListener {
            val mainActivity = activity as? MainActivity
            mainActivity?.closeDrawer()
        }
    }

    private fun init() {
        binding.apply {
            // 지도 옵션 오른쪽 화살표 버튼 클릭 시 펼치기
            var isOptionOpened = false
            mapOpenOptionBtn.setOnClickListener {
                if (isOptionOpened) {
                    isOptionOpened = false
                    mapOpenOptionBtn.setImageResource(R.drawable.icon_map_arrow_down)
                    mapOptionLayout.visibility = View.GONE
                } else {
                    isOptionOpened = true
                    mapOpenOptionBtn.setImageResource(R.drawable.icon_map_arrow_up)
                    mapOptionLayout.visibility = View.VISIBLE
                }
            }

            // 돋보기 버튼 클릭 시 searchActivity로 화면 전환
            searchBtn.setOnClickListener {
                var i = Intent(activity, SearchActivity::class.java)
                startActivity(i)
            }
        }

    }
}