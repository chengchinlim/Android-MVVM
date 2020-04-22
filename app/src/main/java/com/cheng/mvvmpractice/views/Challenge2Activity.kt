package com.cheng.mvvmpractice.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.cheng.mvvmpractice.R
import com.cheng.mvvmpractice.databinding.ActivityChallenge2Binding

class Challenge2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityChallenge2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,
            R.layout.activity_challenge_2
        )

        binding.controlBtn.setOnClickListener {
            startOrStopProgressBar()
        }
    }

    private fun startOrStopProgressBar() {
        binding.apply {
            if (progressBar.visibility == View.GONE) {
                progressBar.visibility = View.VISIBLE
                controlBtn.text = "Stop"
            } else {
                progressBar.visibility = View.GONE
                controlBtn.text = "Start"
            }
        }
    }
}

