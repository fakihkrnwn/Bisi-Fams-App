package com.example.testbisifams.ui.generatif2SC

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Generatif2SCViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Generatif 2 SC Fragment"
    }
    val text: LiveData<String> = _text
}