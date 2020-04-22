package com.cheng.mvvmpractice.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.cheng.mvvmpractice.R
import com.cheng.mvvmpractice.databinding.ActivityChallenge5Binding
import com.cheng.mvvmpractice.viewmodelfactories.Challenge5ViewModelFactory
import com.cheng.mvvmpractice.viewmodels.Challenge5ViewModel

class Challenge5Activity : AppCompatActivity() {
    private lateinit var binding: ActivityChallenge5Binding
    private lateinit var viewModel: Challenge5ViewModel
    private lateinit var viewModelFactory: Challenge5ViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_challenge_5)
        viewModelFactory = Challenge5ViewModelFactory(125)
        binding.lifecycleOwner = this
        viewModel = ViewModelProvider(this,viewModelFactory).get(Challenge5ViewModel::class.java)
        binding.viewModel = viewModel
    }
}
