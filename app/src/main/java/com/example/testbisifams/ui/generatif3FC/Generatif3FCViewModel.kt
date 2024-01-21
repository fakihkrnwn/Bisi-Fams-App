package com.example.testbisifams.ui.generatif3FC

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Generatif3FCViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Generatif 3 FC Fragment"
    }
    val text: LiveData<String> = _text
}