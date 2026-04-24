class Donatur(val nama: String, saldoAwal: Double) {
    var saldo: Double = saldoAwal
        private set

    fun donasi(kampanye: KampanyeDonasi, nominal: Double) {
        println("\n$nama mencoba donasi Rp$nominal")

        if (nominal <= 0) {
            println("❌ Gagal: nominal tidak valid")
            return
        }

        if (saldo < nominal) {
            println("❌ Gagal: saldo tidak cukup (saldo: Rp$saldo)")
            return
        }

        if (kampanye.terimaDonasi(nominal)) {
            saldo -= nominal
            println("✅ Donasi berhasil")
            println("Sisa saldo $nama: Rp$saldo")
        }
    }
}