package com.example.testbisifams.ui.pendahuluanHC

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PendahuluanHCViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Pendahuluan HC Fragment"
    }
    val text: LiveData<String> = _text
}