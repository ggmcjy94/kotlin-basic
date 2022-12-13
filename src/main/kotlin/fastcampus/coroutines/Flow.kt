package fastcampus.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    val flow = simple()

    flow.collect{ value -> println(value) }



}

fun simple() : Flow<Int> = flow {
    println("Flow Started")

    for (i in 1 .. 3) {
        delay(100)
        emit(i)
    }
}