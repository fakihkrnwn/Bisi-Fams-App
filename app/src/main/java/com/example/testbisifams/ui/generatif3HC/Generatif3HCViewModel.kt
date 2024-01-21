package com.example.testbisifams.ui.generatif3HC

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Generatif3HCViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Generatif 3 HC Fragment"
    }
    val text: LiveData<String> = _text
}