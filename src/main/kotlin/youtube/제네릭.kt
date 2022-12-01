class 제네릭 {
}

fun main() {
    val box = Box(10)
    val box2 = Box("Sassdsd")

    println(box.value)
}

class Box<T>(var value:T){

}