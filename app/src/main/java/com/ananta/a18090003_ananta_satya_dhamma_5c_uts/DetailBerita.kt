package com.ananta.a18090003_ananta_satya_dhamma_5c_uts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail_berita.*
import kotlinx.android.synthetic.main.item_layout.*
import kotlin.Int as Int1

class DetailBerita : AppCompatActivity() {

//    companion object {
//        const val EXTRA_NAME = "extra_name"
//        const val EXTRA_DESKRIPSI = "extra_price"
//        const val EXTRA_IMAGE = R.mipmap.ic_launcher_round
//    }

    val judul = intent.getStringExtra("judul")
    val deskripsi = intent.getStringExtra("deskripsi")
    val image = intent.getStringExtra("img")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_berita)
        showProductDetail()
    }

    private fun showProductDetail() {
        txtjudul.text =judul
        txtdeskripsi.text = deskripsi

        val imageView: ImageView = findViewById(R.id.v_img)
        val bundle: Bundle? = intent.extras
        val resId: kotlin.Int? = bundle?.getInt("resId")
        if (resId != null) {
            imageView.setImageResource(resId)
        }


    }
}