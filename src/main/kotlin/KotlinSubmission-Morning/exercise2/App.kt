
import java.time.LocalDate
import java.time.Month

fun main() {
    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     *
     */
    fun main() {
        val evenNumbers = mutableListOf<Int>()

        for (i in 1..100) {
            if (i % 2 == 0) {
                evenNumbers.add(i)
            }
        }
        println(evenNumbers)
    }


    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
     *
     */

    fun main() {
    val monthsMap = mapOf(
    "J" to "Januari",
    "F" to "Februari",
    "M" to "Maret",
    "A" to "April",
    "M" to "Mei",
    "J" to "Juni",
    "J" to "Juli",
    "A" to "Agustus",
    "S" to "September",
    "O" to "Oktober",
    "N" to "November",
    "D" to "Desember"
    )

    // Cetak Map nama bulan
    for ((initial, fullName) in monthsMap) {
    println("$initial: $fullName")
    }
    }

    /**
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...
     *
     */
    fun main() {
        val monthsMap = mapOf(
            "Jan" to "January",
            "Feb" to "February",
            "Mar" to "March",
            "Apr" to "April",
            "May" to "May",
            "Jun" to "June",
            "Jul" to "July",
            "Aug" to "August",
            "Sep" to "September",
            "Oct" to "October",
            "Nov" to "November",
            "Dec" to "December"
        )

        monthsMap.forEach { (initial, fullName) ->
            println("$initial -> $fullName")
        }
    }

    /**
    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     *
     */
    fun main() {
        val birthMonth = Month.APRIL // Gantilah sesuai bulan lahir Anda

        val currentMonth = LocalDate.now().month

        val output = "It's $currentMonth now, I was born in $birthMonth"
        println(output)
    }

}