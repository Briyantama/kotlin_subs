package id.infinitelearning.kotlin_submission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    val greeting = arrayOf("Hello World!",
        "No,I mean it!",
        "HELLO WORLD!")
    var i = 0
    while (i<4){
        try {
            println(greeting[i])
            i++
        }catch (e : ArrayIndexOutOfBoundsException){
            println("Resetting index value")
            break
        }
    }

}