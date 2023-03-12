package com.example.multiplerecyclerviewsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerviewsapplication.adapters.BestsellerAdapter
import com.example.multiplerecyclerviewsapplication.adapters.FashionAdapter
import com.example.multiplerecyclerviewsapplication.adapters.LifestyleAdapter
import com.example.multiplerecyclerviewsapplication.adapters.WhatsNewAdapter
import com.example.multiplerecyclerviewsapplication.utils.BestsellerList
import com.example.multiplerecyclerviewsapplication.utils.WhatsNewList
import com.example.multiplerecyclerviewsapplication.utils.fashionList
import com.example.multiplerecyclerviewsapplication.utils.lifestyleList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//Introduce recyclerview
        val bestSeller: RecyclerView = findViewById(R.id.bestSellerRecyclerView)
        val lifestyle: RecyclerView = findViewById(R.id.lifestyleRecyclerView)
        val fashion: RecyclerView = findViewById(R.id.fashionRecyclerView)
        val whatsNew: RecyclerView = findViewById(R.id.whatsNewRecyclerView)

        //Bestseller Recyclerview Logic
        bestSeller.setHasFixedSize(true)
        bestSeller.setLayoutManager(LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false))
        bestSeller.adapter = BestsellerAdapter(BestsellerList)

        //Lifestyle RecyclerView Logic
        lifestyle.setHasFixedSize(true)
        lifestyle.setLayoutManager(LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false))
        lifestyle.adapter = LifestyleAdapter(lifestyleList)

        //Fashion RecyclerView Logic
        fashion.setHasFixedSize(true)
        fashion.setLayoutManager(LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false))
        fashion.adapter = FashionAdapter(fashionList)

        //What'sNew RecyclerView
        whatsNew.setHasFixedSize(true)
        whatsNew.setLayoutManager(LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false))
        whatsNew.adapter = WhatsNewAdapter(WhatsNewList)


    }
}