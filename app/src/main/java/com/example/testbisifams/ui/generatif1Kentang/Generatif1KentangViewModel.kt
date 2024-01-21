package com.example.testbisifams.ui.generatif1Kentang

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Generatif1KentangViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Generatif 1 Kentang Fragment"
    }
    val text: LiveData<String> = _text
}