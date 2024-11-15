package com.example.museapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.museapp.databinding.FragmentBlank1Binding

class BlankFragment1 : Fragment() {

    private lateinit var binding: FragmentBlank1Binding
    private lateinit var adapter: MyListAdapter
    private val items = listOf("Kill Myself", "Hang Myself", "Throw Ali off a cliff", "Shoot Myself", "Get Chips")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout using ViewBinding
        binding = FragmentBlank1Binding.inflate(inflater, container, false)

        // Initialize RecyclerView
        adapter = MyListAdapter(items)
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = adapter

        return binding.root
    }
}
