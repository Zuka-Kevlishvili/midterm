package com.example.realestatenotes.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface PropertyDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addProperty (property: Property)

    @Update
    suspend fun updateProperty (property: Property)

    @Query("SELECT * FROM property_table ORDER BY id ASC")
    fun readAllData(): LiveData<List<Property>>
}