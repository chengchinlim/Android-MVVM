package com.cheng.mvvmpractice.viewmodels

import androidx.lifecycle.ViewModel

class FirstViewModel: ViewModel() {
    private var count = 0

    fun getCurrentCount(): Int {
        return count
    }

    fun getUpdatedCount(): Int {
        return ++count
    }
}