package com.example.music.views.home

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.music.R
import com.example.music.adapters.home.AlbumAdapter
import com.example.music.adapters.home.TodayHitAdapter
import com.example.music.adapters.home.UserAdapter
import com.example.music.databinding.FragmentHomeBinding
import com.example.music.models.Image
import com.example.music.models.User

class HomeFragment : Fragment() {
    private lateinit var binding : FragmentHomeBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rcvUser = binding.rcvUserHome
        val rcvAlbum = binding.rcvAlbumHome
        val rcvTodayHit = binding.rcvTopHitHome

        //User
        val userAdapter = UserAdapter()
        val userHorizontalLinearLayout = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        rcvUser.layoutManager = userHorizontalLinearLayout
        rcvUser.isNestedScrollingEnabled = false
        rcvUser.focusable = View.NOT_FOCUSABLE

        userAdapter.setData(getUserList())
        rcvUser.adapter = userAdapter

        //Album
        val albumAdapter = AlbumAdapter()
        val albumHorizontalLinearLayout = LinearLayoutManager(requireContext(),  RecyclerView.HORIZONTAL, false)
        rcvAlbum.layoutManager = albumHorizontalLinearLayout
        rcvAlbum.isNestedScrollingEnabled = false
        rcvAlbum.focusable = View.NOT_FOCUSABLE

        albumAdapter.setData(getAlbumList())
        rcvAlbum.adapter = albumAdapter

        //Today Hit
        val todayHitAdapter = TodayHitAdapter()
        val todayHitHorizontalLinearLayout = LinearLayoutManager(requireContext(),  RecyclerView.HORIZONTAL, false)
        rcvTodayHit.layoutManager = todayHitHorizontalLinearLayout
        rcvTodayHit.isNestedScrollingEnabled = false
        rcvTodayHit.focusable = View.NOT_FOCUSABLE

        todayHitAdapter.setData(getTodayHitList())
        rcvTodayHit.adapter = todayHitAdapter
    }

    private fun getTodayHitList(): MutableList<Image> {
        val todayHitList : MutableList<Image> = ArrayList()
        todayHitList.add(Image(R.drawable.cong_phuong))
        todayHitList.add(Image(R.drawable.cong_phuong))
        todayHitList.add(Image(R.drawable.cong_phuong))
        todayHitList.add(Image(R.drawable.cong_phuong))
        return todayHitList
    }

    private fun getAlbumList(): MutableList<Image> {
        val albumList : MutableList<Image> = ArrayList()
        albumList.add(Image(R.drawable.cong_phuong))
        albumList.add(Image(R.drawable.cong_phuong))
        albumList.add(Image(R.drawable.cong_phuong))
        albumList.add(Image(R.drawable.cong_phuong))
        return albumList
    }

    private fun getUserList(): MutableList<User> {
        val userlist : MutableList<User> = ArrayList()
        userlist.add(User(R.drawable.cong_phuong, "Cong Phuong"))
        userlist.add(User(R.drawable.cong_phuong, "Van Toan"))
        userlist.add(User(R.drawable.cong_phuong, "Van Hau"))
        userlist.add(User(R.drawable.cong_phuong, "Van Thanh"))
        return userlist
    }
}