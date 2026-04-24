class Pengelola(val nama: String) {
    fun lihatStatus(kampanye: KampanyeDonasi) {
        println("\n=== STATUS KAMPANYE ===")
        println("Pengelola: $nama")
        println("Judul: ${kampanye.judul}")
        println("Dana terkumpul: Rp${kampanye.danaTerkumpul}")
        println("Target: Rp${kampanye.target}")
        println("Sisa target: Rp${kampanye.sisaTarget()}")
    }
}