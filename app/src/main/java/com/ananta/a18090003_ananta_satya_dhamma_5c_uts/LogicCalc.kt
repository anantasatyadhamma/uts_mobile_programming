package com.ananta.a18090003_ananta_satya_dhamma_5c_uts

class LogicCalc {
    var hasil = 0.0;

    fun tambah(n1 : Double, n2 : Double) : Double {
        this.hasil = n1 + n2
        return n1 + n2
    }
    fun kurang(n1 : Double, n2 : Double) : Double {
        this.hasil = n1 - n2
        return n1 - n2
    }
    fun kali(n1 : Double, n2 : Double) : Double {
        this.hasil = n1 * n2
        return n1 * n2
    }
    fun bagi(n1 : Double, n2 : Double) : Double {
        this.hasil = n1 / n2
        return n1 / n2
    }

}