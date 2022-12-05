package fastcampus.advanced

data class Person(val name:String, val age:Int) {

}

fun main() {

    val person1 = Person("lee", 1)

    val (name, age) = person1

    println("이름= $name, 나이 = $age")
//    println("이름= ${person1.component1()}, 나이 = ${person1.component2()}")


//    val person2 = person1.copy(name="kim")
//    println(person2)

//    val person2 = Person("lee", 1)

//    println(person1 == person2)
//
//    val set = hashSetOf(person1)
//    println(set.contains(person1))



//    person1.name = "kim"
//    println(set.contains(person1))
}

