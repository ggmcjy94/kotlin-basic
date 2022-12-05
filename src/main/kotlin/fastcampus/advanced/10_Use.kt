package fastcampus.advanced

import java.io.FileWriter


//try with resources
fun main () {

    FileWriter("test.txt").use {
        it.write("hello Kotlin")
    }

}