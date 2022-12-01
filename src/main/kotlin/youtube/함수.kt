class 함수 {
}


fun main() {
    println(sum(10, 20))
    println(sum2(10, 20))
    println(sum2(b=10, a=20))
    println(sum2(a=20, b=30, c=40))



}

fun sum (a: Int, b: Int) : Int {
    return a + b
}

//fun sum2(a: Int, b:Int) : Int = a+b


fun sum2(a: Int, b:Int, c: Int = 0) : Int = a+b+c // default 값 넣는것도 가능