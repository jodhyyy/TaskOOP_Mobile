
fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */
    class Hero(val name: String, val activities: Map<String, Int>)

    fun main() {
        val hero = Hero("Masapuan", mapOf(
            "jalan" to 3,
            "lari" to 2,
            "makan" to 4,
            "minum" to 1,
            "lompat" to 5,
            "duduk" to 1
        ))

        println("${hero.name} aktivitas:")
        for ((activity, count) in hero.activities) {
            println("$activity: $count kali")
        }
    }


    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */

    class Hero(val name: String, val activities: Map<String, Int>)

    fun setProfile(hero: Hero) {
        println("${hero.name} aktivitas:")
        for ((activity, count) in hero.activities) {
            println("$activity: $count kali")
        }
    }

    fun main() {
        val masapuan = Hero("Masapuan", mapOf(
            "jalan" to 3,
            "lari" to 2,
            "makan" to 4,
            "minum" to 1,
            "lompat" to 5,
            "duduk" to 1
        ))

        setProfile(masapuan)
    }


    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */
    class Hero(val name: String, val activities: Map<String, Int>)

    fun displayProfile(hero: Hero) {
        println("Profil ${hero.name}:")
        for ((activity, count) in hero.activities) {
            println("$activity: $count kali")
        }
    }

    fun main() {
        val masapuan = Hero("Masapuan", mapOf(
            "jalan" to 3,
            "lari" to 2,
            "makan" to 4,
            "minum" to 1,
            "lompat" to 5,
            "duduk" to 1
        ))

        displayProfile(masapuan)
    }


    /**
    Challenge:
    ===============Class A Morning===============
    Uprising Moon Inteligent -> jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
    Codenesia -> jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
    Massive Bareng -> jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
    POSESIVE -> jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
    Shelter Nerd -> jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
    Fantastic Ten -> jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
    TitansTech -> jalan 1x, lari 3x, makan 1x, minum 1x, lompat 2x, duduk 1x
    Masapuan -> jalan 3x, lari 2x, makan 4x, minum 1x, lompat 5x, duduk 1x
    CollaboraCrew -> jalan 4x, lari 2x, makan 1x, minum 5x, lompat 2x, duduk 3x
    CodeSmiths -> jalan 1x, lari 3x, makan 2x, minum 5x, lompat 4x, duduk 1x
    Webdroid -> jalan 5x, lari 3x, makan 1x, minum 2x, lompat 3x, duduk 2x
    Dasa Impi ->7: jalan 1x, lari 2x, makan 3x, minum 4x, lompat 5x, duduk 6x
    LogicLiberators -> jalan 2x, lari 1x, makan 5x, minum 2x, lompat 3x, duduk 1x
    Fifty-One -> jalan 2x, lari 1x, makan 2x, minum 1x, lompat 2x, duduk 4x

    ===============Class B Morning===============
    Infinine -> jalan 2x, lari 4x, makan 3x, minum 2x, lompat 1x, duduk 2x
    Akatsuki -> jalan 2x, lari 1x, makan 2x, minum 1x, lompat 2x, duduk 4x
    Lumos -> jalan 2x, lari 1x, makan 5x, minum 2x, lompat 3x, duduk 1x
    Big Bang & Dinosaur -> jalan 1x, lari 2x, makan 3x, minum 4x, lompat 5x, duduk 6x
    Baldwin -> jalan 5x, lari 3x, makan 1x, minum 2x, lompat 3x, duduk 2x
    Sychronize -> jalan 1x, lari 3x, makan 2x, minum 5x, lompat 4x, duduk 1x
    WIB (Waktu Indonesia Bahagia) -> jalan 4x, lari 2x, makan 1x, minum 5x, lompat 2x, duduk 3x
    Eternal Light -> jalan 3x, lari 2x, makan 4x, minum 1x, lompat 5x, duduk 1x
    Lizzy Team -> jalan 1x, lari 3x, makan 1x, minum 1x, lompat 2x, duduk 1x
    Best of stars -> jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
    Project Nusantara -> jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
    Orion -> jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
    Freiwilliger -> jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
    **/

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */
    class Hero(val name: String, val activities: Map<String, Int>)

    fun displayProfile(hero: Hero) {
        println("Profil ${hero.name}:")
        for ((activity, count) in hero.activities) {
            println("$activity: $count kali")
        }
    }

    fun jalan(hero: Hero) {
        val count = hero.activities["jalan"] ?: 0
        for (i in 1..count) {
            println("${hero.name} sedang jalan...")
        }
    }

    fun lari(hero: Hero) {
        val count = hero.activities["lari"] ?: 0
        for (i in 1..count) {
            println("${hero.name} sedang lari...")
        }
    }

    fun makan(hero: Hero) {
        val count = hero.activities["makan"] ?: 0
        for (i in 1..count) {
            println("${hero.name} sedang makan...")
        }
    }

    fun minum(hero: Hero) {
        val count = hero.activities["minum"] ?: 0
        for (i in 1..count) {
            println("${hero.name} sedang minum...")
        }
    }

    fun lompat(hero: Hero) {
        val count = hero.activities["lompat"] ?: 0
        for (i in 1..count) {
            println("${hero.name} sedang lompat...")
        }
    }

    fun duduk(hero: Hero) {
        val count = hero.activities["duduk"] ?: 0
        for (i in 1..count) {
            println("${hero.name} sedang duduk...")
        }
    }

    fun main() {
        val masapuan = Hero("Masapuan", mapOf(
            "jalan" to 3,
            "lari" to 2,
            "makan" to 4,
            "minum" to 1,
            "lompat" to 5,
            "duduk" to 1
        ))

        displayProfile(masapuan)

        jalan(masapuan)
        lari(masapuan)
        makan(masapuan)
        minum(masapuan)
        lompat(masapuan)
        duduk(masapuan)
    }


    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */
    class Hero(val name: String, val activities: MutableMap<String, Int>)

    fun displayProfile(hero: Hero) {
        println("Profil ${hero.name}:")
        for ((activity, count) in hero.activities) {
            println("$activity: $count kali")
        }
    }

    fun jalan(hero: Hero) {
        val count = hero.activities["jalan"] ?: 0
        for (i in 1..count) {
            println("${hero.name} sedang jalan...")
        }
        hero.activities["jalan"] = 0
        displayProfile(hero)
    }

    fun lari(hero: Hero) {
        val count = hero.activities["lari"] ?: 0
        for (i in 1..count) {
            println("${hero.name} sedang lari...")
        }
        hero.activities["lari"] = 0
        displayProfile(hero)
    }

    fun makan(hero: Hero) {
        val count = hero.activities["makan"] ?: 0
        for (i in 1..count) {
            println("${hero.name} sedang makan...")
        }
        hero.activities["makan"] = 0
        displayProfile(hero)
    }

    fun minum(hero: Hero) {
        val count = hero.activities["minum"] ?: 0
        for (i in 1..count) {
            println("${hero.name} sedang minum...")
        }
        hero.activities["minum"] = 0
        displayProfile(hero)
    }

    fun lompat(hero: Hero) {
        val count = hero.activities["lompat"] ?: 0
        for (i in 1..count) {
            println("${hero.name} sedang lompat...")
        }
        hero.activities["lompat"] = 0
        displayProfile(hero)
    }

    fun duduk(hero: Hero) {
        val count = hero.activities["duduk"] ?: 0
        for (i in 1..count) {
            println("${hero.name} sedang duduk...")
        }
        hero.activities["duduk"] = 0
        displayProfile(hero)
    }

    fun main() {
        val masapuan = Hero("Masapuan", mutableMapOf(
            "jalan" to 3,
            "lari" to 2,
            "makan" to 4,
            "minum" to 1,
            "lompat" to 5,
            "duduk" to 1
        ))

        displayProfile(masapuan)

        jalan(masapuan)
        lari(masapuan)
        makan(masapuan)
        minum(masapuan)
        lompat(masapuan)
        duduk(masapuan)
    }




}