package fastcampus.advanced
// arrow 라이브러리 적용 하면 다양한 함수를 사용가능
fun main() {

//    val list = mutableListOf(printHello)
//
//    val func: () -> Unit = list[0]
//    func()


//    call(printHello)

//    val list = mutableListOf(printNo())
//    call(printNo)
//    val result = plus(1,3, 5)
//    println(result)

//    val list = listOf("a","b","c")
//    val printStr : (String) -> Unit = { println(it) }
//    forEachStr(list, printStr)
//
//    val uppercase : (String) -> String = {it.uppercase()}
//    println(list.map(uppercase))


//    val outerFunc = outerFunc()
//    outerFunc()


//
//    val list = listOf("a","b","c")
//
//    val printStr : (String) -> Unit = { println(it) }
//
//    forEachStr(list) {
//        println(it)
//    }
//
//    list.forEach {
//        println(it)
//    }
//
//    list.filter {
//        it == "a"
//    }

//    arg1 {
//        it.length
//        it.first()
//    }
//
//    arg2 {a:String, b:String ->
//        a.length
//        b.first()
//    }



//    val callReference:() -> Unit = { printHello() }
    val callReference = ::printHello
    callReference()()

    val numberList = listOf("1","2","3")
    numberList.map { it.toInt() }.forEach { println(it) }
    numberList.map(String::toInt).forEach (::println )




}

val printHello : () -> Unit = { println("Hello") }

fun arg1(block: (String) -> Unit) {}
fun arg2(block: (String, String) -> Unit){}


val sum : (Int, Int) -> Int = {x:Int, y:Int -> x + y}

val sum2 = {x: Int, y:Int -> x + y}



//익명 함수
fun outerFunc() : () -> Unit = { println("이것은 익명함수!") }

//고차함수 함수를 전달 받아 리턴
fun forEachStr(collection: Collection<String>, action:(String) -> Unit) {
    for (item in collection) {
        action(item)
    }
}

val printMessage: (String) -> Unit = { message: String -> println(message) }
//val printMessage2: (String) -> Unit = { message -> println(message) }
//val printMessage3: (String) -> Unit = {  println(it) }

//val plus : (Int, Int, Int) -> Int = {a, b, c -> a + b + c}
//
//
//val printHello : () -> Unit = { println("Hello") }
////val func : () -> String = {"1"}
//
//
//// 함수를 인자로 받아 실행하는 함수
//fun call (block: () -> Unit) {
//    block()
//}
//
//fun printNo() = print("No!")


