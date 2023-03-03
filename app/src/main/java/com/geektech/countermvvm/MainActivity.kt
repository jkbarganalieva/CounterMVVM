package com.geektech.countermvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.geektech.countermvvm.databinding.ActivityMainBinding
import com.geektech.countermvvm.remote.CounterViewModel

class MainActivity : AppCompatActivity(), CounterView {

    private val viewModel: CounterViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()

        viewModel.liveCount.observe(this) {
            binding.tvResult.text = it.toString()
        }
    }

    private fun initClicker() {
        with(binding) {
            btnIncrement.setOnClickListener {
                viewModel.increment()
            }

            btnDecrement.setOnClickListener {
                viewModel.decrement()
            }
        }
    }
}



































