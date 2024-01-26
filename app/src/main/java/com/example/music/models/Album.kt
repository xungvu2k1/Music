package com.example.music.models

data class Album(
    val id : Int,
    val name : String,
    val songList : List<Song>,
    val image : Int? = null
)