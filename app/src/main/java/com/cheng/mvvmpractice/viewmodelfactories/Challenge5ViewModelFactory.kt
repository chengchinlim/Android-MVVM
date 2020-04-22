package com.cheng.mvvmpractice.viewmodelfactories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.cheng.mvvmpractice.viewmodels.Challenge5ViewModel
import java.lang.IllegalArgumentException

class Challenge5ViewModelFactory(private val startingTotal : Int) : ViewModelProvider.Factory{

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(Challenge5ViewModel::class.java)){
            return Challenge5ViewModel(startingTotal) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }


}