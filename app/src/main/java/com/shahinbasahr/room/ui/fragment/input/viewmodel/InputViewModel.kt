package com.shahinbasahr.room.ui.fragment.input.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shahinbasahr.room.database.Note
import com.shahinbasahr.room.repository.NoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class InputViewModel @Inject constructor(private val repository: NoteRepository):ViewModel(){

//    init {
//        viewModelScope.launch{
//            repository.addNote(Note("",""))
//        }
//        repository.getNote()
//    }

}