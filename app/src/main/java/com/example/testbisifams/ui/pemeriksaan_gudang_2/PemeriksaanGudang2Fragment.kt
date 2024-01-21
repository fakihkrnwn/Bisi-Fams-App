package com.example.testbisifams.ui.pemeriksaan_gudang_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.testbisifams.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PemeriksaanGudang2Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PemeriksaanGudang2Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_pemeriksaan_gudang2
            , container, false)

        // Dapatkan referensi ke Spinner dari XML
        val spinner: Spinner = rootView.findViewById(R.id.spinnerPilihan)

        // Daftar pilihan untuk Spinner
        val pilihan = arrayOf("Pilih", "Lulus", "Tidak Lulus")

        // Buat adapter untuk Spinner
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, pilihan)

        // Set tata letak dropdown untuk adapter
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Tetapkan adapter ke Spinner
        spinner.adapter = adapter

        // Tambahkan listener untuk menanggapi item yang dipilih
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                // Tindakan yang diambil saat item dipilih
                val selectedItem = pilihan[position]
                // Lakukan sesuatu dengan item yang dipilih
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Tindakan yang diambil saat tidak ada item yang dipilih
            }
        }
        return rootView
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PemeriksaanGudang2Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            PemeriksaanGudang2Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}