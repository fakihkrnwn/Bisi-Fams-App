package com.example.testbisifams.ui.fase_masak

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FaseMasakViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Fase Masak Fragment"
    }
    val text: LiveData<String> = _text
}