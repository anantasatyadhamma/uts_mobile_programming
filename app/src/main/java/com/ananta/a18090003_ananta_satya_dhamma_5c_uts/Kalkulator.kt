package com.ananta.a18090003_ananta_satya_dhamma_5c_uts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kalkulator.*

class Kalkulator : AppCompatActivity() {


    private val logic=LogicCalc();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)

        supportActionBar?.apply {
            title = "Kalkulator"
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        val nilai1 = edtNilai1.text
        val nilai2 = edtNilai2.text

        btnTambah.setOnClickListener(){
            if(edtNilai1.text.toString().isEmpty()){
                edtNilai1.setError("Harus diisi!!");
            }else if(edtNilai2.text.toString().isEmpty()){
                edtNilai2.setError("Harus diisi!");
            }
            txtHasil.text = "${logic.tambah(
                nilai1.toString().toDouble(),
                nilai2.toString().toDouble())
            }"
        }

        btnKurang.setOnClickListener(){
            if(edtNilai1.text.toString().isEmpty()){
                edtNilai1.setError("Harus diisi!!");
            }else if(edtNilai2.text.toString().isEmpty()){
                edtNilai2.setError("Harus diisi!");
            }
            txtHasil.text = "${logic.kurang(
                nilai1.toString().toDouble(),
                nilai2.toString().toDouble())
            }"
        }

        btnKali.setOnClickListener(){
            if(edtNilai1.text.toString().isEmpty()){
                edtNilai1.setError("Harus diisi!!");
            }else if(edtNilai2.text.toString().isEmpty()){
                edtNilai2.setError("Harus diisi!");
            }
            txtHasil.text = "${logic.kali(
                nilai1.toString().toDouble(),
                nilai2.toString().toDouble())
            }"
        }

        btnBagi.setOnClickListener(){
            if(edtNilai1.text.toString().isEmpty()){
                edtNilai1.setError("Harus diisi!!");
            }else if(edtNilai2.text.toString().isEmpty()){
                edtNilai2.setError("Harus diisi!");
            }
            txtHasil.text = "${logic.bagi(
                nilai1.toString().toDouble(),
                nilai2.toString().toDouble())
            }"
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }





}