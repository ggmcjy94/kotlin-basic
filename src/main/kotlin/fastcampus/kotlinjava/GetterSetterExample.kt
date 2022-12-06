package fastcampus.kotlinjava

fun main () {

    val person = Person()
    person.setName("토니")
    person.setAge(44)
    person.setAddress("스타크 타워")

    println(person.getName())
    println(person.getAge())

    val person2 = Person()
    person2.name = "토니 스타크 "
    person2.age = 44

    println(person.name)
    println(person.age)

}

