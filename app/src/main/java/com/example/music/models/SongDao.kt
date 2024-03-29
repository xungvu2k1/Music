package com.example.music.models

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SongDao {
    @Query("SELECT * FROM songs")
    fun getAllSongs(): List<Song>?

    @Insert
    fun insertSong(song: Song)
}