package com.cheng.mvvmpractice.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.cheng.mvvmpractice.R
import com.cheng.mvvmpractice.databinding.ActivityChallenge3Binding
import com.cheng.mvvmpractice.viewmodels.Challenge3ViewModel
import com.cheng.mvvmpractice.viewmodelfactories.Challenge3ViewModelFactory

class Challenge3Activity : AppCompatActivity() {
    private lateinit var viewModel: Challenge3ViewModel
    private lateinit var viewModelFactory: Challenge3ViewModelFactory
    private lateinit var binding: ActivityChallenge3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // factory needed if ViewModel constructor needs param
        viewModelFactory =
            Challenge3ViewModelFactory(
                123
            )
        viewModel = ViewModelProvider(this, viewModelFactory).get(Challenge3ViewModel::class.java)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_challenge_3)
        binding.totalTv.text = viewModel.getTotal().toString()
    }

    fun onAddClicked(v: View) {
        val number = binding.edtNumber.text.toString().toInt()
        viewModel.addNo(number)
        binding.totalTv.text = viewModel.getTotal().toString()
    }
}
