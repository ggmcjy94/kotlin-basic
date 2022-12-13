package fastcampus.coroutines

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking <Unit> {
//    launch {
//        delay(500)
//        println("World")
//    }
//
//
//    println("Hello")

    val job1 = launch {
        val elapsedTime = measureTimeMillis {
            delay(150)
        }
        println("async task-1 $elapsedTime ms")
    }

    job1.cancel()

    val job2 = launch(start = CoroutineStart.LAZY) {
        val elapsedTime = measureTimeMillis {
            delay(100)
        }
        println("async task-2 $elapsedTime ms")
    }

    println("start task-2")
    job2.start()


}