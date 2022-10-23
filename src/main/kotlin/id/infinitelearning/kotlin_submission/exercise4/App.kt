package id.infinitelearning.kotlin_submission.exercise4

import java.util.Scanner

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    val greeting = arrayOf("Hello World!",
        "No,I mean it!",
        "HELLO WORLD!")
    var i = 0
    print("Kalimat yang ingin ditampilkan : ")
    val input = Scanner(System.`in`)
    val n : Int = input.nextInt()
    while (i < n){
        try {
            println(greeting[i])
            i++
        }catch (e : ArrayIndexOutOfBoundsException){
            println("Resetting index value")
            break
        }
    }

}