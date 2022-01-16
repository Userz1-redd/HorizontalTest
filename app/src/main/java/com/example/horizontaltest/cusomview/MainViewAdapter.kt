package com.example.horizontaltest.cusomview

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.horizontaltest.databinding.ItemContentBinding

class MainViewAdapter : RecyclerView.Adapter<MainViewHolder>() {
    private lateinit var list : ArrayList<String>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        Log.d("TAG", "onCreateViewHolder:called ")
        val binding = ItemContentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        Log.d("TAG", "onBindViewHolder:called ")
        holder.bindWithView(this.list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
    fun submitList(list : ArrayList<String>){
        this.list = list
    }
}