package com.example.multiplerecyclerviewsapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerviewsapplication.R
import com.example.multiplerecyclerviewsapplication.models.LifestyleModel

class LifestyleAdapter(private val lifestyleList: MutableList<LifestyleModel>): RecyclerView.Adapter<LifestyleAdapter.ViewHolder>() {

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val lifestyleImage: ImageView = view.findViewById(R.id.lifestyle_Image1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.lifestyle_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.apply{
            lifestyleImage.setImageResource(lifestyleList[position].image)
        }
    }

    override fun getItemCount(): Int = lifestyleList.size
}