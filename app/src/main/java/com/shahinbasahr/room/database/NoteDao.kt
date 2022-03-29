package com.shahinbasahr.room.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addNote(note:Note)

    @Query("SELECT * FROM Note")
    suspend fun getNote():List<Note>
}