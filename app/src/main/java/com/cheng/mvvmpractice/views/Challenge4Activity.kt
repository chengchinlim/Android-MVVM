package com.cheng.mvvmpractice.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.cheng.mvvmpractice.R
import com.cheng.mvvmpractice.databinding.ActivityChallenge4Binding
import com.cheng.mvvmpractice.viewmodels.Challenge4ViewModel

class Challenge4Activity : AppCompatActivity() {
    private lateinit var binding: ActivityChallenge4Binding
    private lateinit var viewModel: Challenge4ViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_challenge_4)
        viewModel = ViewModelProvider(this).get(Challenge4ViewModel::class.java)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
    }
}
