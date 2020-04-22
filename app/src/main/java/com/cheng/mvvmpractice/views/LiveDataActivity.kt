package com.cheng.mvvmpractice.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.cheng.mvvmpractice.R
import com.cheng.mvvmpractice.databinding.ActivityLiveDataBinding
import com.cheng.mvvmpractice.viewmodelfactories.LiveDataActivityViewModelFactory
import com.cheng.mvvmpractice.viewmodels.LiveDataActivityViewModel

class LiveDataActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLiveDataBinding
    private lateinit var viewModel: LiveDataActivityViewModel
    private lateinit var viewModelFactory: LiveDataActivityViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_live_data)
        viewModelFactory = LiveDataActivityViewModelFactory(125)
        viewModel = ViewModelProvider(this, viewModelFactory).get(LiveDataActivityViewModel::class.java)
        viewModel.totalData.observe(this, Observer {
            binding.resultTv.text = it.toString()
        })

        binding.insertBtn.setOnClickListener {
            viewModel.setTotal(binding.inputEdt.text.toString().toInt())
        }

    }
}
