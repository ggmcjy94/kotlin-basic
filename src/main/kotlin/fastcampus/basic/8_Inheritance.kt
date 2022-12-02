package fastcampus.basic

open class Dog {
    open var age:Int = 0

    open fun bark() {
        println("멍멍")
    }
}

open class Bulldog(final override var age: Int = 0) : Dog() {

    final override fun bark() { // override 된건 자동으로 open 되있음 상속을 막을려면 final
        println("컹컹")
        super.bark()
    }
}

abstract class Developer {

    abstract var age: Int
    abstract fun code(language:String)
}

class BackendDeveloper(override var age: Int): Developer() {

    override fun code(language: String) {
        println("I code with $language")
    }

}


fun main() {

    val backendDeveloper = BackendDeveloper(4)
    println("${backendDeveloper.age}")
    backendDeveloper.code("kotlin")
//    val bulldog = Bulldog(4)
//    println(bulldog.age)
//    bulldog.bark()

}