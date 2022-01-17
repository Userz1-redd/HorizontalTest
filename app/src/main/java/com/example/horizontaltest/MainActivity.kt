package com.example.horizontaltest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.horizontaltest.cusomview.MainViewAdapter
import com.example.horizontaltest.cusomview.StickyHeaderItemDecoration
import com.example.horizontaltest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mBinding: ActivityMainBinding
    lateinit var adapter: MainViewAdapter
    companion object {
        var TAG = "TAG"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        adapter = MainViewAdapter()
        initView()

    }
    private fun initView() {
        mBinding.mainRecyclerView.apply {
            itemAnimator = null
            layoutManager = LinearLayoutManager(context)
            var list = ArrayList<String>()
            for(i in 1..100) {
                list.add(i.toString())
            }
            this@MainActivity.adapter.submitList(list)
            adapter = this@MainActivity.adapter
            addItemDecoration(StickyHeaderItemDecoration(getSectionCallback()))
            }


    }
    private fun getSectionCallback(): StickyHeaderItemDecoration.SectionCallback {
        return object : StickyHeaderItemDecoration.SectionCallback {
            override fun isHeader(position: Int): Boolean {
                return adapter.isHeader(position)
            }

            override fun getHeaderLayoutView(list: RecyclerView, position: Int): View? {
                return adapter.getHeaderView(list, position)
            }
        }
    }

}