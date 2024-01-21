package com.example.testbisifams.ui.generatif2FC

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Generatif2FCViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Generatif 2 FC Fragment"
    }
    val text: LiveData<String> = _text
}