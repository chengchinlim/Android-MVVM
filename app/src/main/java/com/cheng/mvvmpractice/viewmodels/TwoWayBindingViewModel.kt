package com.cheng.mvvmpractice.viewmodels

import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TwoWayBindingViewModel: ViewModel(), Observable {
    @Bindable
    val userName = MutableLiveData<String>()
    init {
        userName.value = "Cheng"
    }
    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }

}