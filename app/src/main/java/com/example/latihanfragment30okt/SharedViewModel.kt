package com.example.latihanfragment30okt

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    val currentNumber: MutableLiveData<Int> = MutableLiveData()
}