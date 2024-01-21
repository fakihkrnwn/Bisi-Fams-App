package com.example.testbisifams.ui.VegetatifSC

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VegetatifSCViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Vegetatif SC Fragment"
    }
    val text: LiveData<String> = _text
}