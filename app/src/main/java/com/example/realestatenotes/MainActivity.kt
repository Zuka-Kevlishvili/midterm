package com.example.realestatenotes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.realestatenotes.data.Property
import com.example.realestatenotes.data.PropertyViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.card_layout.*

class MainActivity : AppCompatActivity(), OnPropertyClick {

    lateinit var buttonAdd: Button
    lateinit var mPropertyViewModel: PropertyViewModel
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null
    private var propertyList = emptyList<Property>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        layoutManager = LinearLayoutManager(this)
        recyclerview.layoutManager = layoutManager
        adapter = RecyclerAdapter(this)
        recyclerview.adapter = adapter

        mPropertyViewModel = ViewModelProvider(this)[PropertyViewModel::class.java]
        mPropertyViewModel.readAllData.observe(this) { property ->
            (adapter as RecyclerAdapter).setData(property)
        }

        init()
        onClick()
    }




    private fun init() {
        buttonAdd = findViewById(R.id.buttonAdd)
    }

    private fun onClick() {
        buttonAdd.setOnClickListener() {
            val intent = Intent(this, AddPropertyActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onPropertyItemClicked(position: Int) {
        Toast.makeText(this, "Updating property $position", Toast.LENGTH_LONG).show()
        val intent = Intent(this, UpdatePropertyActivity::class.java)
        intent.putExtra("title", propertyTitle.text)
        intent.putExtra("location", propertyLocation.text)
        intent.putExtra("id", position.toString())
        startActivity(intent)
    }
}