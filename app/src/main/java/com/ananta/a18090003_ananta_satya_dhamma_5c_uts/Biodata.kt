package com.ananta.a18090003_ananta_satya_dhamma_5c_uts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Biodata : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        supportActionBar?.apply {
            title = "Berita"
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}