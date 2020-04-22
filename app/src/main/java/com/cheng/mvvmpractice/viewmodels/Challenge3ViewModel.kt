package com.cheng.mvvmpractice.viewmodels

import androidx.lifecycle.ViewModel

class Challenge3ViewModel(t: Int): ViewModel() {
    private var total = t

    fun getTotal(): Int {
        return total
    }

    fun addNo(no: Int) {
        total += no
    }
}