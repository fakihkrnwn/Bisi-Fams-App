package com.example.testbisifams.ui.pendahuluanFC

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PendahuluanFCViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Pendahuluan FC Fragment"
    }
    val text: LiveData<String> = _text
}