class Donatur(val nama: String, saldoAwal: Double) {
    var saldo: Double = saldoAwal
        private set

    fun donasi(nominal: Double) {
        if (saldo >= nominal) {
            saldo -= nominal
            println("$nama berhasil donasi Rp$nominal")
        } else {
            println("Saldo tidak cukup")
        }
    }
}