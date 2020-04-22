package com.cheng.mvvmpractice.viewmodelfactories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.cheng.mvvmpractice.viewmodels.Challenge3ViewModel
import java.lang.IllegalArgumentException

class Challenge3ViewModelFactory(private val t: Int): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(Challenge3ViewModel::class.java)) {
            return Challenge3ViewModel(t) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }
}