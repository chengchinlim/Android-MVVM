package com.cheng.mvvmpractice.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.cheng.mvvmpractice.R
import com.cheng.mvvmpractice.databinding.ActivityTwoWayBindingBinding
import com.cheng.mvvmpractice.viewmodels.TwoWayBindingViewModel

class TwoWayBindingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTwoWayBindingBinding
    private lateinit var viewModel: TwoWayBindingViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_two_way_binding)
        viewModel = ViewModelProvider(this).get(TwoWayBindingViewModel::class.java)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}
