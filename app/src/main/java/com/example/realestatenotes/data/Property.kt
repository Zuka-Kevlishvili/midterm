package com.example.realestatenotes.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "property_table")
data class Property (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val location: String
) : Parcelable