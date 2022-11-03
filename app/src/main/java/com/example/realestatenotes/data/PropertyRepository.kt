package com.example.realestatenotes.data

import androidx.lifecycle.LiveData

class PropertyRepository(private val propertyDao: PropertyDao) {
    val readAllData: LiveData<List<Property>> = propertyDao.readAllData()

    suspend fun addProperty(property: Property) {
        propertyDao.addProperty(property)
    }

    suspend fun updateProperty(property: Property) {
        propertyDao.updateProperty(property)
    }
}