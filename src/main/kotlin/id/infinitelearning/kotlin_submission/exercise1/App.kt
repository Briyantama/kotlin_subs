package id.infinitelearning.kotlin_submission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan cetak setiap variabel ke layar saat variable myProfile di panggil
 */
class MyProfile {

    val namaDepan = "Briyantama"
    val namaBelakang = "Wahab"
    private val umur = 21
    private val status = false

    fun profile(){
        println("========= Profile =========")
        println("Name: $namaDepan $namaBelakang")
        println("Age: $umur")
        if (status) {
            println("Status: Single")
        } else {
            println("Status: tidak")
        }
        println("===========================")
    }

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String) {
    var i = 1
    println("======== Group $groupId $session =========")
    for (element in groupMember) {
        print("$i. ")
        println(element)
        i++
    }
    println("==================================")


}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myName ini
 *
 */
fun myName(namaDepan : String, namaBelakang : String): String {

    return "$namaDepan $namaBelakang"

}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {

    val mentor = arrayOf("Dian", "Sani", "Ardy", "Reza")
    val countOfGroup = 6

    return mentor.size + countOfGroup

}

fun main() {

    val myProfile = MyProfile()
    myProfile.profile()

    val myName = myName(myProfile.namaDepan, myProfile.namaBelakang)
    println("My Name is: $myName")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(2,
        listOf("Alifian Akmal A.",
            "Aqil Jawadal F.",
            "Briyantama W.",
            "Clinton Dody H.B.",
            "I Desak Made A.",
            "Wisnu Aryo S."),
        "Morning")

}