package com.foxcoder.cvapplication

import android.os.Bundle

import com.foxcoder.cvapplication.databinding.ActivityMainBinding
import com.foxcoder.cvapplication.view.BaseActivity

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}