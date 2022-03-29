package com.shahinbasahr.room.ui.fragment.main.viewmodel

import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shahinbasahr.room.database.Note
import com.shahinbasahr.room.repository.NoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class MainViewModel @Inject constructor(@ApplicationContext val context: Context,private val repository: NoteRepository):ViewModel() {
    fun goToInput(view:View){

        viewModelScope.launch {
            repository.addNote(Note("Shahin Bashar ","Badakfjashar"))
            var list=repository.getNote()
            Toast.makeText(context, list.toString(), Toast.LENGTH_SHORT).show()
        }

    }


}