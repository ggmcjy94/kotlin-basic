package fastcampus.advanced

//확장 함수
fun String.first() : Char {
    return this[0]
}

fun String.addFirst(char:Char) : String {
    return char + this.substring(0)
}

class MyExample {
    fun printMessage() = println("클래스 출력")
}
fun MyExample?.printNullOrNotNull() {
    if (this == null) println("널인 경우 출력")
    else println("널이 아닌 경우 출력")
}
// 동일한 함수 변수 있어도 컴파일 에러 나옴 그리고 실행 안됌 ex:} 오버로딩 형식으로 확장 해야됌
fun MyExample.printMessage(message:String) = println(message)

fun main() {

    var myExample : MyExample? = null
    myExample.printNullOrNotNull()

    myExample = MyExample()
    myExample.printNullOrNotNull()

    println("ABCD".first())
    println("ABCD".addFirst('Z'))

    MyExample().printMessage("확장출력")
}