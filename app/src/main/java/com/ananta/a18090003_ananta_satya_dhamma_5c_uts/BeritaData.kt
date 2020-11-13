package com.ananta.a18090003_ananta_satya_dhamma_5c_uts

object BeritaData {

    val listBerita : ArrayList<Berita>
        get() {
            val list = arrayListOf<Berita>()
            for(data in dataBerita){
                val berita = Berita()
                berita.judul = data[0].toString()
                berita.deskripsi  = data[1].toString()
                berita.image = data[2] as Int
                list.add(berita)
            }
            return list
        }

    private var dataBerita = arrayOf(
        arrayOf("Di Tengah Pandemi, Pemerintah Tetap Jalankan Reformasi Sistem Pendidikan", "Menteri Keuangan Sri Mulyani Indrawati membeberkan, infrastruktur pendidikan menjadi salah satu yang disorot pemerintah di tengah pandemi. Bagaimana caranya para pelajar maaupun mahasiswa tetap bisa melakukan pembelajaran dengan jarak jauh.", R.mipmap.berita1),
        arrayOf("Siswa Indonesia Raih Prestasi Gemilang di Olimpiade Tuymaada", "Tim SIMETRI dari Indonesia yang diseleksi dan dibina Yayasan Sinergi Mencerdaskan Tunas Negeri berhasil meraih prestasi gemilang pada Olimpiade Matematika Internasional Tuymaada ke-27.", R.mipmap.berita2),
        arrayOf("Pembuat Robot Bahas Tantangan dan Inovasi di Meet the Cobot Leaders", "Terlepas dari berita tersebut, baru-baru ini, Universal Robots, kreator robot kolaboratif (cobot) mengadakan sesi pertemuan online bertajuk \"Meet the Cobot Leaders\" atau “Bertemu dengan Pemimpin Cobot”.", R.mipmap.berita3)
    )
}
