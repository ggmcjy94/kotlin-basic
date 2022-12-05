package fastcampus.advanced

// f((1, 3)) = 1 + 3 = 4
//fun plus(a:Int, b : Int) = a + b
//튜플
//data class Tuple (val a: Int, val b : Int)
//
//fun plus (tuple: Tuple) = tuple.a + tuple.b

fun plus(pair: Pair<Int, Int>) = pair.first + pair.second

fun main() {
    val plus = plus(Pair(1, 3))
    println(plus)

    val pair = Pair("A" , 1)
    val newPair = pair.copy(first = "B") // val 불변이라 이런식으로 고쳐야됌
    println(newPair)


    val second = newPair.component2()
    println(second)

    val list = newPair.toList()
    println(list)

    val triple = Triple("A", "B", "C")
    println(triple)
    triple.first
    triple.second
    val newTriple = triple.copy(third = "D")
    println(newTriple)

    //구조 분해 함수
    val (a:String, b:String, c:String) = newTriple
    println("$a, $b, $c")


    val list3: List<String> = newTriple.toList()
    val(a1,b1,c1) = list3
    println("$a1, $b1, $c1")


    val map = mutableMapOf("이상호" to "개발자")
    for ((key, value) in map) {
        println("$key 의 직업은 $value")
    }

}