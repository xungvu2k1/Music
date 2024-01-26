package com.example.music.adapters.music

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.music.views.music.AlbumsFragment
import com.example.music.views.music.ArtistsFragment
import com.example.music.views.music.PlaylistFragment

class MusicViewPagerAdapter(fm : FragmentManager, behavior : Int) : FragmentStatePagerAdapter(fm, behavior) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> PlaylistFragment()
            1 -> AlbumsFragment()
            2 -> ArtistsFragment()
            else -> PlaylistFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title = ""
        when (position) {
            0 -> title = "Playlist"
            1 -> title = "Albums"
            2 -> title = "Artists"
        }
        return title
    }

}