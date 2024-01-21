package com.example.testbisifams.ui.pemeriksaan_gudang_2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PemeriksaanGudang2ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Pemeriksaan Gudang Ke-2 Fragment"
    }
    val text: LiveData<String> = _text
}