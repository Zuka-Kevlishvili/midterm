package com.example.realestatenotes.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Property::class], version = 1, exportSchema = false)
abstract class PropertyDatabase: RoomDatabase() {
    abstract fun propertyDao(): PropertyDao

    companion object{
        @Volatile
        private var INSTANCE: PropertyDatabase? = null

        fun getDatabase(context: Context): PropertyDatabase {
            val tempInsance = INSTANCE
            if (tempInsance != null) {
                return tempInsance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PropertyDatabase::class.java,
                    "property_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}