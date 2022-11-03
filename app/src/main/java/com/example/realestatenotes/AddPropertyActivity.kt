package com.example.realestatenotes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.lifecycle.ViewModelProvider
import com.example.realestatenotes.data.Property
import com.example.realestatenotes.data.PropertyViewModel

class AddPropertyActivity : AppCompatActivity() {

    lateinit var editTextTitle: EditText
    lateinit var editTextLocation: EditText
    lateinit var buttonAddProperty: Button
    lateinit var mPropertyViewModel: PropertyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_property)

        mPropertyViewModel = ViewModelProvider(this).get(PropertyViewModel::class.java)

        init()
        buttonAddProperty.setOnClickListener {
            insertData()
        }

    }


    private fun init() {
        editTextTitle = findViewById(R.id.editTextTitle)
        editTextLocation = findViewById(R.id.editTextLocation)
        buttonAddProperty = findViewById(R.id.buttonAddProperty)
    }

    private fun insertData() {
        val title = editTextTitle.text.toString()
        val location = editTextLocation.text.toString()
        if(checkIfNotEmpty(title, location)) {
            val property = Property(0,title,location)
            val intent = Intent(this, MainActivity::class.java)
            mPropertyViewModel.addProperty(property)
            Toast.makeText(this, "საკუთრება წარმატებით დაემატა!", Toast.LENGTH_LONG).show()
            startActivity(intent)
        } else {
            Toast.makeText(this, "გთხოვთ შეავსოთ ყველა ველი!", Toast.LENGTH_LONG).show()
        }
    }

    private fun checkIfNotEmpty(title: String, location: String): Boolean {
        return !(TextUtils.isEmpty(title) && TextUtils.isEmpty(location))
    }
}