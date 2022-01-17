package com.example.horizontaltest.cusomview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.horizontaltest.R
import com.example.horizontaltest.databinding.ItemContentBinding
import com.example.horizontaltest.databinding.ItemHeaderBinding

class MainViewAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private lateinit var list : ArrayList<String>
    lateinit var headerBinding:ItemHeaderBinding
    lateinit var contentBinding: ItemContentBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) :RecyclerView.ViewHolder{
        when(viewType){
            0 -> {
                headerBinding = ItemHeaderBinding.inflate(LayoutInflater.from(parent.context),parent,false)
                return MainViewHolder2(headerBinding)
            }
            else -> {
                contentBinding = ItemContentBinding.inflate(LayoutInflater.from(parent.context),parent,false)
                return MainViewHolder(contentBinding)
            }
        }

    }

    override fun onBindViewHolder(holder : RecyclerView.ViewHolder, position: Int) {
        if(holder is MainViewHolder){
            holder.bindWithView(list[position])
        }
        if(holder is MainViewHolder2){
            holder.bindWithView(list[position])
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
    fun submitList(list : ArrayList<String>){
        this.list = list
    }

    override fun getItemViewType(position: Int): Int {
        return if(position==0) 0 else 1
    }

    fun isHeader(position: Int) = position==0

    fun getHeaderView(list: RecyclerView, position: Int): View? {
        val binding = ItemHeaderBinding.inflate(LayoutInflater.from(list.context), list, false)
        return binding.root
    }

}