fun main() {
    val kampanye = KampanyeDonasi("Galang Dana Mahasiswa", 1000000.0)

    val haekal = Donatur("Haekal", 500000.0)
    val rahmad = Donatur("Rahmad", 100000.0)

    val pengelola = Pengelola("Rubian")

    println("=== SIMULASI DONASI ===")

    haekal.donasi(kampanye, 200000.0)
    rahmad.donasi(kampanye, 150000.0)
    haekal.donasi(kampanye, 300000.0)
    rahmad.donasi(kampanye, 100000.0)

    pengelola.lihatStatus(kampanye)
}