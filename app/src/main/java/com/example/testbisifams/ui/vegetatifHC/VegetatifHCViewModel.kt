package com.example.testbisifams.ui.vegetatifHC

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VegetatifHCViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Vegetatif HC Fragment"
    }
    val text: LiveData<String> = _text
}