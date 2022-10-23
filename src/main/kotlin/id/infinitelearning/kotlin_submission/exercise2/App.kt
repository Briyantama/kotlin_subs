package id.infinitelearning.kotlin_submission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */

    val ganjil = mutableListOf<Int>()
    val genap = mutableListOf<Int>()
    for (element in 1..100) {
        val hasil = element % 2
        if (hasil==1){
            ganjil.add(element)
        } else {
            genap.add(element)
        }
    }
    println(ganjil)
    println(genap)

    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...

    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */

    val bulan =
        mapOf("jan" to "Januari",
            "feb" to "Februari",
            "mar" to "Maret",
            "apr" to "April",
            "mei" to "Mei",
            "jun" to "Juni",
            "jul" to "Juli",
            "agu" to "Agustus",
            "sep" to "September",
            "okt" to "Oktober",
            "nov" to "November",
            "des" to "Desember"
        )

    bulan.forEach{ (i, b) ->
        println("$i -> $b")
    }

    val monthNow = bulan.getValue("okt")
    val birthMonth = bulan.getValue("feb")

    println("It's $monthNow now, I was born in $birthMonth")
}
