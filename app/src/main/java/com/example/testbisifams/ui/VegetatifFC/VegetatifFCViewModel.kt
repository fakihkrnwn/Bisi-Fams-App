package com.example.testbisifams.ui.VegetatifFC

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VegetatifFCViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Vegetatif FC Fragment"
    }
    val text: LiveData<String> = _text
}