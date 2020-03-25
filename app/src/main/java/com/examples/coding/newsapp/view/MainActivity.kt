package com.examples.coding.newsapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.examples.coding.newsapp.R
import com.examples.coding.newsapp.databinding.ActivityMainBinding
import com.examples.coding.newsapp.viewmodel.NewsListViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var viewModel : NewsListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(NewsListViewModel::class.java)
        binding.viewmodel = viewModel
    }
}
