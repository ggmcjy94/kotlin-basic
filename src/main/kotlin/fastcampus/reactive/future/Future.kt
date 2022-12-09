package fastcampus.reactive.future

import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit


fun sum (a : Int, b : Int) = a + b
fun main() {

    val pool = Executors.newSingleThreadExecutor()
    val future = pool.submit ( Callable {
        sum(100, 200)
    })

    println("계산 시작")
    val futureResult = future.get()
    println(futureResult)
    println("계산 종료")


}