package com.cheng.mvvmpractice.viewmodelfactories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.cheng.mvvmpractice.viewmodels.LiveDataActivityViewModel
import java.lang.IllegalArgumentException

class LiveDataActivityViewModelFactory(private val startingTotal : Int) : ViewModelProvider.Factory{

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LiveDataActivityViewModel::class.java)){
            return LiveDataActivityViewModel(startingTotal) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }


}