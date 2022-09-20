package com.example.gdroom_d_10362.room

@Entity
data class Note (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val note: String
    )