package com.shahinbasahr.room.di

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.room.Room
import com.shahinbasahr.room.database.NoteDao
import com.shahinbasahr.room.database.NoteDatabase
import com.shahinbasahr.room.repository.NoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    fun provideNoteDao(noteDatabase: NoteDatabase): NoteDao = noteDatabase.noteDao()

    @Singleton
    @Provides
    fun provideNoteDatabase(@ApplicationContext context: Context): NoteDatabase {
       return Room.databaseBuilder(context, NoteDatabase::class.java, "NoteDatabase").build().apply {
           Log.d("DatabaseTest",this.toString())
       }
    }
    @Provides
    fun provideNoteRepository(noteDao: NoteDao) = NoteRepository(noteDao)
}