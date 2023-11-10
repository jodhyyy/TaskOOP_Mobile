
fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    fun main() {
        try {
            val numerator = 10 // Pembilang
            val denominator = 0 // Penyebut

            val result = numerator / denominator
            println("Hasil pembagian: $result")
        } catch (e: ArithmeticException) {
            println("Terjadi kesalahan: ${e.message}")
        }
    }

}