package com.cheng.mvvmpractice.viewmodels

import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Challenge5ViewModel(startingTotal : Int) : ViewModel(), Observable {
    @Bindable
    private var total = MutableLiveData<Int>()
    val totalData : LiveData<Int>
        get() = total
    @Bindable
    val inputText = MutableLiveData<String>()


    init {
        total.value = startingTotal
    }

    fun add() {
        val inputInt = inputText.value?.toInt()
        inputInt?.let {
            total.value =(total.value)?.plus(it)
        }
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }
}