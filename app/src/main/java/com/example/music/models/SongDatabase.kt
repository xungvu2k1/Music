package com.example.music.models

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Song::class], version = 1)
abstract class SongDatabase : RoomDatabase() {
    abstract fun songDao(): SongDao

    companion object {
        private var instance : SongDatabase? = null
        fun getInstance(context: Context): SongDatabase {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    SongDatabase::class.java,
                    "song.db"
                )
                    .allowMainThreadQueries()
                    .build()
            }
            return instance!!
        }
    }
}