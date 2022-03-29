package com.shahinbasahr.room.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Note")
data class Note(
    val note:String,
    val time:String
){
    @PrimaryKey(autoGenerate = true)
    var id:Int=0
}