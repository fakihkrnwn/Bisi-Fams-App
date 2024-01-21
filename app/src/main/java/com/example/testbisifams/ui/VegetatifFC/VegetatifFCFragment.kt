package com.example.testbisifams.ui.VegetatifFC

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
 * Use the [VegetatifFCFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class VegetatifFCFragment : Fragment() {
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
        val rootView = inflater.inflate(R.layout.fragment_vegetatif_f_c, container, false)

        // Dapatkan referensi ke Spinner dari XML
        val spinner: Spinner = rootView.findViewById(R.id.spinnerPilihan)
        val spinner2: Spinner = rootView.findViewById(R.id.spinnerPilihan2)
        val spinner3: Spinner = rootView.findViewById(R.id.spinnerPilihan3)
        val spinner4: Spinner = rootView.findViewById(R.id.spinnerPilihan4)
        val spinner5: Spinner = rootView.findViewById(R.id.spinnerPilihan5)
        val spinner6: Spinner = rootView.findViewById(R.id.spinnerPilihan6)
        val spinner7: Spinner = rootView.findViewById(R.id.spinnerPilihan7)

        // Daftar pilihan untuk Spinner
        val pilihan = arrayOf("Pilih", "Baik", "Kurang")
        val pilihan2 = arrayOf("Pilih", "Ada", "Tidak Ada")
        val pilihan3 = arrayOf("Pilih", "Baik", "Cukup", "Abnormal")
        val pilihan4 = arrayOf("Pilih", "Lulus", "Tidak Lulus")

        // Buat adapter untuk Spinner
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, pilihan)
        val adapter2 = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, pilihan2)
        val adapter3 = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, pilihan3)
        val adapter4 = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, pilihan4)

        // Set tata letak dropdown untuk adapter
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Tetapkan adapter ke Spinner
        spinner.adapter = adapter
        spinner2.adapter = adapter2
        spinner3.adapter = adapter3
        spinner4.adapter = adapter2
        spinner5.adapter = adapter2
        spinner6.adapter = adapter2
        spinner7.adapter = adapter4

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

        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                // Tindakan yang diambil saat item dipilih
                val selectedItem = pilihan2[position]
                // Lakukan sesuatu dengan item yang dipilih
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Tindakan yang diambil saat tidak ada item yang dipilih
            }
        }

        spinner3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                // Tindakan yang diambil saat item dipilih
                val selectedItem = pilihan3[position]
                // Lakukan sesuatu dengan item yang dipilih
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Tindakan yang diambil saat tidak ada item yang dipilih
            }
        }

        spinner4.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                // Tindakan yang diambil saat item dipilih
                val selectedItem = pilihan2[position]
                // Lakukan sesuatu dengan item yang dipilih
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Tindakan yang diambil saat tidak ada item yang dipilih
            }
        }

        spinner5.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                // Tindakan yang diambil saat item dipilih
                val selectedItem = pilihan2[position]
                // Lakukan sesuatu dengan item yang dipilih
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Tindakan yang diambil saat tidak ada item yang dipilih
            }
        }

        spinner6.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                // Tindakan yang diambil saat item dipilih
                val selectedItem = pilihan2[position]
                // Lakukan sesuatu dengan item yang dipilih
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Tindakan yang diambil saat tidak ada item yang dipilih
            }
        }

        spinner7.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                // Tindakan yang diambil saat item dipilih
                val selectedItem = pilihan4[position]
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
         * @return A new instance of fragment FaseVegetatifFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            VegetatifFCFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}