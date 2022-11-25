
class 클래스( // 앞에다 data class 붙히면 eqaulse hashcodㄷ tostring 다해줌
    val name: String,
    var age: Int
) {
    var hobby = "축구"
        private set
        get() = "취미 : $field"

    init {
        println("init")
    }

    fun some() {
        hobby = "농구"
    }
}

fun main() {
    val john = 클래스("Jhon", 20)
    val john2 = 클래스("Jhon", 20)

    println(john.hobby)
    println(john)
    println(john2)
    println(john == john2)

//    println(john.name)
//    println(john.age)
////    john.name = "hyun"  val 이라 수정 불가능
//    john.age = 30
//    println(john.age)
}