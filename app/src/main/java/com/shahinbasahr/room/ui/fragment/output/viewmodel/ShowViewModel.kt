package com.shahinbasahr.room.ui.fragment.output.viewmodel

import androidx.lifecycle.ViewModel
import com.shahinbasahr.room.repository.NoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ShowViewModel @Inject constructor(private val repository: NoteRepository) :ViewModel(){

}