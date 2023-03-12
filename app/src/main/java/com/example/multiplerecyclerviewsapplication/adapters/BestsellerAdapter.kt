package com.example.multiplerecyclerviewsapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerviewsapplication.R
import com.example.multiplerecyclerviewsapplication.models.BestsellerModel

class BestsellerAdapter(private val BestSellerList: MutableList<BestsellerModel>):
RecyclerView.Adapter<BestsellerAdapter.ViewHolder>(){

    class ViewHolder (val view: View) : RecyclerView.ViewHolder(view) {
        val BestSellerImage: ImageView = view.findViewById(R.id.bestseller_image1)
        val BestSellerLabelText: TextView = view.findViewById(R.id.bestSellerLabelText)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.best_seller_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.apply {
            BestSellerImage.setImageResource(BestSellerList[position].image)
            BestSellerLabelText.text = BestSellerList[position].label
        }
    }

    override fun getItemCount(): Int = BestSellerList.size
}