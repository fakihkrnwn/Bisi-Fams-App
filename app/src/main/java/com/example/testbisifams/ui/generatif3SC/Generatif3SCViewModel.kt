package com.example.testbisifams.ui.generatif3SC

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Generatif3SCViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Generatif 3 SC Fragment"
    }
    val text: LiveData<String> = _text
}