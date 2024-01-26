package com.example.music

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.music.views.home.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Khởi tạo FragmentManager
        val fragmentManager : FragmentManager = supportFragmentManager;

        // Bắt đầu một giao dịch fragment
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

        // Thêm fragment mới vào
        // Thêm fragment mới vào
        val homeFragment = HomeFragment()
        fragmentTransaction.replace(R.id.fragment_container, homeFragment)
        // nếu muốn thêm vào ngăn xếp fragment
        // fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}