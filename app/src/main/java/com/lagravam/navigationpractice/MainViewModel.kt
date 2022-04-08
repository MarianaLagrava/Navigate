package com.lagravam.navigationpractice

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val name = MutableLiveData("")
    val lastname = MutableLiveData("")
}