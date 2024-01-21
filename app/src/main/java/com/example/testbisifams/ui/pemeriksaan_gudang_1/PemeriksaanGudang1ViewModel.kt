package com.example.testbisifams.ui.pemeriksaan_gudang_1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PemeriksaanGudang1ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Pemeriksaan Gudang Ke-1 Fragment"
    }
    val text: LiveData<String> = _text
}