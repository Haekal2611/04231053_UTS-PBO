class KampanyeDonasi(val judul: String, val target: Double) {
    var danaTerkumpul: Double = 0.0
        private set

    fun terimaDonasi(nominal: Double): Boolean {
        if (danaTerkumpul + nominal > target) {
            println("❌ Gagal: donasi melebihi target kampanye")
            return false
        }

        danaTerkumpul += nominal
        println("Total dana sekarang: Rp$danaTerkumpul")
        return true
    }

    fun sisaTarget(): Double {
        return target - danaTerkumpul
    }
}