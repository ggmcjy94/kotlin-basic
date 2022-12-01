class 콜백함수 {
}

fun main() {

    myFunc(10) {
        println("함수 호출")
    }
}

fun myFunc(a: Int, callback: () -> Unit ={}) {
    println("함수 시작")
    callback()
    println("함수 끝")
}