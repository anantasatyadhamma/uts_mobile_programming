package com.ananta.a18090003_ananta_satya_dhamma_5c_uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_berita.*

class BeritaActivity : AppCompatActivity() {

    private var list: ArrayList<Berita> = arrayListOf()
    private lateinit var beritaAdapter: BeritaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita)
        showList()
        setListClickAction()

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

    private fun showList(){
        list.addAll(BeritaData.listBerita)
        beritaAdapter = BeritaAdapter(list)
        rv_list.layoutManager = LinearLayoutManager(this)
        rv_list.adapter = beritaAdapter
        }

    private fun setListClickAction() {
        beritaAdapter.setOnItemClickCallback(
            object : BeritaAdapter.OnItemClickCallback {
                override fun onItemClick(data: Berita) {
                    Toast.makeText(this@BeritaActivity,
                        "Anda memilih ${data.judul}",
                        Toast.LENGTH_SHORT).show()
                    val goToDetail = Intent(
                        this@BeritaActivity,
                        DetailBerita::class.java
                    )
                    goToDetail.putExtra("judul", data.judul)
                    goToDetail.putExtra("deskripsi", data.deskripsi)
                    goToDetail.putExtra("img", data.image)


                    startActivity(goToDetail)
                }
            })
    }
    }





