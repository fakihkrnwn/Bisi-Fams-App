package com.example.testbisifams.ui.pendahuluanSC

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PendahuluanSCViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Pendahuluan SC Fragment"
    }
    val text: LiveData<String> = _text
}