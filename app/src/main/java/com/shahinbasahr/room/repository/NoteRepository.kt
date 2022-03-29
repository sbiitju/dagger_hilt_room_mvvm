package com.shahinbasahr.room.repository

import com.shahinbasahr.room.database.Note
import com.shahinbasahr.room.database.NoteDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class NoteRepository @Inject constructor(private val noteDao: NoteDao) : INoteRepository {
    override suspend fun getNote(): List<Note> = withContext(Dispatchers.IO) {
        noteDao.getNote()
    }


    override suspend fun addNote(note: Note) = withContext(Dispatchers.IO) {
        noteDao.addNote(note)
    }
}