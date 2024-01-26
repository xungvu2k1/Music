package com.example.music.adapters.music

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.music.R
import com.example.music.models.Song

class PlaylistAdapter( val context: Context) : RecyclerView.Adapter<PlaylistAdapter.SongViewHolder>(){

    private lateinit var mSongList: List<Song>

    @SuppressLint("NotifyDataSetChanged")
    fun setData(list : List<Song>){
        this.mSongList = list
        // cực kì quan trọng để thông báo về sự thay đổi của dữ liệu
        notifyDataSetChanged()
    }

    class SongViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val imgSong : ImageView
        val tvSongName : TextView
        val tvSingerName : TextView


        init{
            imgSong = view.findViewById(R.id.img_song)
            tvSongName = view.findViewById(R.id.tv_song_name)
            tvSingerName = view.findViewById(R.id.tv_singer_name)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_song, parent, false)
        return SongViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mSongList.size
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        mSongList[position].resourceImage?.let { holder.imgSong.setImageResource(it) }
        holder.tvSongName.text = mSongList[position].title
        holder.tvSingerName.text = mSongList[position].artist
    }
}