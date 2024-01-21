package com.example.testbisifams.ui.generatif1FC

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Generatif1FCViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Generatif 1 FC Fragment"
    }
    val text: LiveData<String> = _text
}