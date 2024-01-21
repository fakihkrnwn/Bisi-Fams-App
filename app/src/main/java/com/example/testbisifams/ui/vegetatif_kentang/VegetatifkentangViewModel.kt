package com.example.testbisifams.ui.vegetatif_kentang

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VegetatifkentangViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Vegetatif Kentang FC Fragment"
    }
    val text: LiveData<String> = _text
}