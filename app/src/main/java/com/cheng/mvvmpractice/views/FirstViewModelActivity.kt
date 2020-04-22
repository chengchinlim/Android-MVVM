package com.cheng.mvvmpractice.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.cheng.mvvmpractice.R
import com.cheng.mvvmpractice.databinding.ActivityFirstViewModelBinding
import com.cheng.mvvmpractice.viewmodels.FirstViewModel

class FirstViewModelActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFirstViewModelBinding
    private lateinit var viewModel: FirstViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_first_view_model)
        viewModel = ViewModelProvider(this).get(FirstViewModel::class.java)
        binding.countText.text = viewModel.getCurrentCount().toString()
        binding.button.setOnClickListener {
            binding.countText.text = viewModel.getUpdatedCount().toString()
        }
    }
}
