package com.example.multiplerecyclerviewsapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerviewsapplication.R
import com.example.multiplerecyclerviewsapplication.models.WhatsNewModel
import com.example.multiplerecyclerviewsapplication.utils.WhatsNewList

class WhatsNewAdapter(private val whatsNewList: MutableList<WhatsNewModel>) :
RecyclerView.Adapter<WhatsNewAdapter.ViewHolder>(){

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val newImage: ImageView = view.findViewById(R.id.whatsNew_Image)
        val newLabel: TextView = view.findViewById(R.id.whatsNew_labelText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.whatsnew_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.apply {
           newImage.setImageResource((whatsNewList[position].image))
            newLabel.text = whatsNewList[position].label
        }
    }

    override fun getItemCount(): Int = WhatsNewList.size
}