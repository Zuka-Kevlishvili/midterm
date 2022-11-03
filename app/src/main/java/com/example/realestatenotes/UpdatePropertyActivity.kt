package com.example.realestatenotes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.realestatenotes.data.Property
import com.example.realestatenotes.data.PropertyViewModel
import kotlinx.android.synthetic.main.activity_update_property.*

class UpdatePropertyActivity : AppCompatActivity() {
    lateinit var editTextTitleUpdate: EditText
    lateinit var editTextLocationUpdate: EditText
    lateinit var mPropertyViewModel: PropertyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_property)

        mPropertyViewModel = ViewModelProvider(this).get(PropertyViewModel::class.java)

        editTextTitleUpdate = findViewById(R.id.editTextTitleUpdate)
        editTextLocationUpdate = findViewById(R.id.editTextLocationUpdate)

        editTextTitleUpdate.setText(intent.getStringExtra("title"))
        editTextLocationUpdate.setText(intent.getStringExtra("location"))

        buttonUpdateProperty.setOnClickListener {
            updateData()
        }
    }

    private fun updateData() {
        val id = intent.getStringExtra("id")
        val position = id!!.toInt()
        val title = editTextTitleUpdate.text.toString()
        val location = editTextLocationUpdate.text.toString()

        if(checkIfNotEmpty(title, location)) {
            val updatedTitle = editTextTitleUpdate.text.toString()
            val updatedLocation = editTextLocationUpdate.text.toString()
            val updatedProperty = Property(position, updatedTitle, updatedLocation)
            mPropertyViewModel.updateProperty(updatedProperty)
            val intent = Intent(this, MainActivity::class.java)
            Toast.makeText(this, "საკუთრება წარმატებით განახლდა!", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }
    }

    private fun checkIfNotEmpty(title: String, location: String): Boolean {
        return !(TextUtils.isEmpty(title) && TextUtils.isEmpty(location))
    }

}