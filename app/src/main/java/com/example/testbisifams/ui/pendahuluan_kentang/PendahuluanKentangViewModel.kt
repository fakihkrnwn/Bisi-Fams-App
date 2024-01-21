package com.example.testbisifams.ui.pendahuluan_kentang

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PendahuluanKentangViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Pendahuluan Kentang Fragment"
    }
    val text: LiveData<String> = _text
}