// bỏ
//package com.example.music.adapters
//
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import com.example.music.R
//import com.example.music.adapters.home.UserAdapter
//import com.example.music.models.HomeCategory
//
//class HomeCategoryAdapter (val context : Context) : RecyclerView.Adapter<HomeCategoryAdapter.HomeCategoryViewHolder>() {
//    private lateinit var _mCategoryList : MutableList<HomeCategory>
//    val mCategoryList : List<HomeCategory> get() = _mCategoryList
//
//    fun setData(list : MutableList<HomeCategory>) {
//        this._mCategoryList = list
//        notifyDataSetChanged()
//    }
//    class HomeCategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val nameCategory : TextView = itemView.findViewById(R.id.tv_name_home_category)
//        val rcv_user : RecyclerView = itemView.findViewById(R.id.rcv_user_home_category)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeCategoryViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_category_home, parent, false)
//        return HomeCategoryViewHolder(view)
//    }
//
//    override fun getItemCount(): Int {
//        return _mCategoryList.size
//    }
//
//    override fun onBindViewHolder(holder: HomeCategoryViewHolder, position: Int) {
//        holder.nameCategory.text = _mCategoryList[position].nameCategory
//
//        // khai bao adapter
//        val linearLayoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
//        holder.rcv_user.layoutManager = linearLayoutManager
//        //truyen du lieu cho adapter
//        val userAdapter = UserAdapter()
//        userAdapter.setData(_mCategoryList[position].userList)
//        //set adapter cho rcv
//        holder.rcv_user.adapter =userAdapter
//
//    }
//}