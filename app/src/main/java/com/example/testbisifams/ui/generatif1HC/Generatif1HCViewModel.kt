package com.example.testbisifams.ui.generatif1HC

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Generatif1HCViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Generatif 1 HC Fragment"
    }
    val text: LiveData<String> = _text
}