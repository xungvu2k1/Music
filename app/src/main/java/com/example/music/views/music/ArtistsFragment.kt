package com.example.music.views.music

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.music.R
import com.example.music.adapters.music.ArtistAdapter
import com.example.music.databinding.FragmentArtistsBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ArtistsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ArtistsFragment : Fragment() {
    /private lateinit var mFragmentArtistsBinding : FragmentArtistsBinding
    private lateinit var rcvArtist : RecyclerView
    private lateinit var mArtistAdapter : ArtistAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        mFragmentArtistsBinding = FragmentArtistsBinding.inflate(inflater, container, false)
        return mFragmentArtistsBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rcvArtist = mFragmentArtistsBinding.rcvArtistFrag
        mArtistAdapter = ArtistAdapter(requireContext())

        val gridLayoutManager = GridLayoutManager(requireContext(), 2)
        rcvArtist.layoutManager = gridLayoutManager

        mArtistAdapter.setData(getArtistList())
        rcvArtist.adapter = mArtistAdapter
    }

    private fun getArtistList() : List<Artist>{
        val artistList : MutableList<Artist> = ArrayList()
        artistList.add(Artist(R.drawable.cong_phuong, "son tung"))
        artistList.add(Artist(R.drawable.cong_phuong, "jack"))
        artistList.add(Artist(R.drawable.cong_phuong, "issac"))
        artistList.add(Artist(R.drawable.cong_phuong,"mono"))

        artistList.add(Artist(R.drawable.cong_phuong,  "cong phuong"))
        artistList.add(Artist(R.drawable.cong_phuong, "messi"))
        artistList.add(Artist(R.drawable.cong_phuong, "ronaldo"))
        artistList.add(Artist(R.drawable.cong_phuong, "mbappe"))
        return artistList
    }
}