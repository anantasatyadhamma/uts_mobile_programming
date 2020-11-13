package com.ananta.a18090003_ananta_satya_dhamma_5c_uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.apply {
            title = "Dashboard"
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        btnList.setOnClickListener {
            val goToBerita= Intent(this,BeritaActivity::class.java)
            startActivity(goToBerita)
        }

        btnCalculator.setOnClickListener {
            val goToKalkulator= Intent(this,Kalkulator::class.java)
            startActivity(goToKalkulator)
        }

        btnKeluar.setOnClickListener {
            finish()
            System.exit(0)
        }

        btnBio.setOnClickListener {
            val goToBio= Intent(this,Biodata::class.java)
            startActivity(goToBio)
        }




    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}