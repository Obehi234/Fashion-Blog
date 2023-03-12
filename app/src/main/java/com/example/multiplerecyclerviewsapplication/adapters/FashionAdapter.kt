package com.example.multiplerecyclerviewsapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.multiplerecyclerviewsapplication.R
import com.example.multiplerecyclerviewsapplication.models.FashionModel

class FashionAdapter(private val fashionList: MutableList<FashionModel>) : RecyclerView.Adapter<FashionAdapter.ViewHolder>() {

    class ViewHolder (val view: View) : RecyclerView.ViewHolder(view) {

        val fashionImage: ImageView = view.findViewById(R.id.fashionImage_1)
        val fashionLabel: TextView = view.findViewById(R.id.fashionLabelText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
       val view = LayoutInflater.from(parent.context).inflate(R.layout.fashion_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.apply {
            fashionImage.setImageResource(fashionList[position].image)
            fashionLabel.text = fashionList[position].label
        }
    }

    override fun getItemCount(): Int = fashionList.size
}