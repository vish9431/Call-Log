package com.kaholas.calllog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kaholas.calllog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var callLogAdapter : CallLogAdapter
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setUpRecyclerView()


    }

    private fun setUpRecyclerView() {
        callLogAdapter = CallLogAdapter()
        binding.rvCalllog.apply {
            adapter = callLogAdapter
            layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
        }

        callLogAdapter.differ.submitList(calllog)
    }
}