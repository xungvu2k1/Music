package com.example.music.adapters.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.music.R
import com.example.music.models.Image

class AlbumAdapter : RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder>() {
    private lateinit var _mAlbumList : MutableList<Image>
    val mAlbumList : List<Image> get() = _mAlbumList

    fun setData(list : MutableList<Image>){
        this._mAlbumList =list
        notifyDataSetChanged()
    }

    class AlbumViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val albumImg : ImageView = view.findViewById(R.id.img_item_home_album)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_home_album, parent, false)
        return AlbumViewHolder(view)
    }

    override fun getItemCount(): Int {
        return _mAlbumList.size
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        _mAlbumList[position].imgResource?.let { holder.albumImg.setImageResource(it) }
    }
}