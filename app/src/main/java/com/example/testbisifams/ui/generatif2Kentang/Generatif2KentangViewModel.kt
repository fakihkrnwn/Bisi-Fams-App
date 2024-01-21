package com.example.testbisifams.ui.generatif2Kentang

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Generatif2KentangViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Generatif 2 Kentang Fragment"
    }
    val text: LiveData<String> = _text
}