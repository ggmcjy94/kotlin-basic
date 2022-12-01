class 상속 {

}

fun main() {
    val dog: Animal = Dog()
    val cat = Cat()

    if (dog is Dog) {

        println("멍멍이")
    }

}

interface Drawable {
    fun draw()
}

abstract class Animal {
    open fun move() {
        println("이동")
    }
}


class Dog  : Animal(), Drawable {
    override fun move() {
       println("껑충 ")
    }

    override fun draw() {

    }
}
class Cat : Animal(), Drawable {
    override fun move() {
        println("성큼")
    }

    override fun draw() {

    }
}