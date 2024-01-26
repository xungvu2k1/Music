package com.example.music.adapters.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.music.R
import com.example.music.models.Image


class TodayHitAdapter : RecyclerView.Adapter<TodayHitAdapter.HitViewHolder>() {
    private lateinit var _mHitList : MutableList<Image>
    val mHitList : List<Image> get() = _mHitList

    fun setData(list : MutableList<Image>){
        this._mHitList =list
        notifyDataSetChanged()
    }

    class HitViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val hitImg : ImageView = view.findViewById(R.id.img_home_item_today_hit)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):  HitViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_home_today_hit, parent, false)
        return HitViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mHitList.size
    }

    override fun onBindViewHolder(holder: HitViewHolder, position: Int) {
        _mHitList[position].imgResource?.let { holder.hitImg.setImageResource(it) }
    }
}
