package com.example.testbisifams.ui.generatif2HC

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Generatif2HCViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Generatif 2 HC Fragment"
    }
    val text: LiveData<String> = _text
}