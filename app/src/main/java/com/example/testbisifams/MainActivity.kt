package com.example.testbisifams

import android.os.Bundle
import android.view.Menu
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.testbisifams.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)
        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_pendahuluan_fc, R.id.nav_vegetatif_fc, R.id.nav_generatif_1_fc, R.id.nav_generatif_2_fc, R.id.nav_generatif_3_fc, R.id.nav_profile, R.id.nav_fase_masak, R.id.nav_pendahuluan_sc, R.id.nav_vegetatif_sc, R.id.nav_generatif_1_sc, R.id.nav_generatif_2_sc, R.id.nav_generatif_3_sc, R.id.nav_pendahuluan_hc, R.id.nav_vegetatif_hc, R.id.nav_generatif_1_hc, R.id.nav_generatif_2_hc, R.id.nav_generatif_3_hc, R.id.nav_pendahuluan_kentang, R.id.nav_vegetatif_kentang, R.id.nav_generatif_1_kentang, R.id.nav_generatif_2_kentang, R.id.nav_pemeriksaan_gudang_1, R.id.nav_pemeriksaan_gudang_2
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}