package com.example.realestatenotes

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.realestatenotes.data.Property
import kotlinx.android.synthetic.main.card_layout.view.*


class RecyclerAdapter(private val onPropertyClick: OnPropertyClick): RecyclerView.Adapter<RecyclerAdapter.ViewHolder> () {

    private var propertyList = emptyList<Property>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return propertyList.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        val item = propertyList[position]
        holder.itemView.propertyTitle.text = item.title
        holder.itemView.propertyLocation.text = item.location
        holder.itemView.setOnClickListener {
            onPropertyClick.onPropertyItemClicked(position)
        }
    }

    fun setData(property: List<Property>) {
        this.propertyList = property
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var properyImage: ImageView
        var propertyTitle: TextView
        var propertyLocation: TextView

        init {
            properyImage = itemView.findViewById(R.id.propertyImage)
            propertyTitle = itemView.findViewById(R.id.propertyTitle)
            propertyLocation = itemView.findViewById(R.id.propertyLocation)
        }
    }

}