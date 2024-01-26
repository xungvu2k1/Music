package com.example.music.adapters.music

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.music.R
import com.example.music.models.Artist

class ArtistAdapter( val context: Context) : RecyclerView.Adapter<ArtistAdapter.ArtistViewHolder>() {

    private lateinit var mArtistList: List<Artist>

    fun setData(list: List<Artist>) {
        this.mArtistList = list
        // cực kì quan trọng để thông báo về sự thay đổi của dữ liệu
        notifyDataSetChanged()
    }

    class ArtistViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgSinger: ImageView
        val tvSingerName: TextView


        init {
            imgSinger = view.findViewById(R.id.img_singer_item_artist)
            tvSingerName = view.findViewById(R.id.tv_name_item_artist)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_artist, parent, false)
        return ArtistViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mArtistList.size
    }

    override fun onBindViewHolder(holder: ArtistViewHolder, position: Int) {
        holder.imgSinger.setImageResource(mArtistList[position].resourceImage)
        holder.tvSingerName.text = mArtistList[position].name
    }
}