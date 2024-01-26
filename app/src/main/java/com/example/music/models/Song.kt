package com.example.music.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "songs")
data class Song(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val resourceImage : Int? = null,
    val title: String? = null,
    val artist: String? = null,
    val album: String? = null,
    val filePath: String? = null
)