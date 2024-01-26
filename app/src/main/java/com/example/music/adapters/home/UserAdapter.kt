package com.example.music.adapters.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.music.R
import com.example.music.models.User

class UserAdapter : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    private lateinit var _mUserList : MutableList<User>
    val mUserList : List<User> get() = _mUserList

    fun setData(list : MutableList<User>){
        this._mUserList =list
        notifyDataSetChanged()
    }

    class UserViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val userImg : ImageView = view.findViewById(R.id.tv_user_img)
        val username : TextView = view.findViewById(R.id.tv_username)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int {
        return _mUserList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        _mUserList[position].imgResource?.let { holder.userImg.setImageResource(it) }?: "null"
        holder.username.text = _mUserList[position].name.toString()
    }

}