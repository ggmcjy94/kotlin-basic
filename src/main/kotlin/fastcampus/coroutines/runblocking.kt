package fastcampus.coroutines

import kotlinx.coroutines.runBlocking

fun main () {

    runBlocking {
        println("hello")
        println(Thread.currentThread().name)
    }


    println("world")
    println(Thread.currentThread().name)

}