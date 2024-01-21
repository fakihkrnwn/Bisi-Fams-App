package com.example.testbisifams.ui.generatif1SCC

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Generatif1SCViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Generatif 1 SC Fragment"
    }
    val text: LiveData<String> = _text
}