package com.shahinbasahr.room.repository

import androidx.annotation.WorkerThread
import com.shahinbasahr.room.database.Note

interface INoteRepository {
    suspend fun getNote(): List<Note>
    @WorkerThread
    suspend fun addNote(note: Note)
}