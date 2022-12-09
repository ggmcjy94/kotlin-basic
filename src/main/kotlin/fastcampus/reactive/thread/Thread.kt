package fastcampus.reactive.thread

fun main() {
    for (i in 0 .. 100000000000000) {
        val thread = Thread(Runnable {
            println("current-thread-name : ${Thread.currentThread().name}")
        })
        thread.start()
    }

    println("current-thread-name : ${Thread.currentThread().name}")
}