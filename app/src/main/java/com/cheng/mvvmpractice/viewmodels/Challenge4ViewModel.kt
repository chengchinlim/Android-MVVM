package com.cheng.mvvmpractice.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Challenge4ViewModel : ViewModel() {
    private var count = MutableLiveData(0)
    val totalCount: LiveData<Int>
    get() = count

    fun addCount(i: Int) {
        count.value = (count.value)!!.plus(i)
    }
}