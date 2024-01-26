package com.example.music.adapters.bottomview

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.music.views.bookmark.BookmarksFragment
import com.example.music.views.home.HomeFragment
import com.example.music.views.music.MusicFragment
import com.example.music.views.person.PersonFragment
import com.example.music.views.search.SearchFragment

class BottomViewPagerAdapter(fm: FragmentManager, behavior: Int) :
    FragmentStatePagerAdapter(fm, behavior) {
    override fun getCount(): Int {
        return 5
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> HomeFragment()
            1 -> SearchFragment()
            2 -> MusicFragment()
            3 -> BookmarksFragment()
            4 -> PersonFragment()
            else -> HomeFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title = ""
        when (position) {
            0 -> title = "Home"
            1 -> title = "Search"
            2 -> title = "Music"
            3 -> title = "Bookmarks"
            4 -> title = "Person"
        }
        return title
    }

}