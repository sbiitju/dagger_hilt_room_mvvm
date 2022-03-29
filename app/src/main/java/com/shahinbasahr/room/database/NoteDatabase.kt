package com.shahinbasahr.room.database

import androidx.room.Database
import androidx.room.RoomDatabase
import javax.inject.Inject
@Database(entities = [Note::class], version = 2, exportSchema = true)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun noteDao():NoteDao
}