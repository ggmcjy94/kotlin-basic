package fastcampus.advanced

class MyGenerics<out T>(val t: T) {

}

class Bag<T> {
    fun saveAll(to : MutableList<in T>, from:MutableList<T>) {
        to.addAll(from)
    }
}
fun main () {

    val generics = MyGenerics<String>("테스트")
    val charGenerics : MyGenerics<CharSequence> = generics


    val bag = Bag<String>()
    bag.saveAll(mutableListOf<CharSequence>("1","2"), mutableListOf<String>("3","4"))


//    val generics = MyGenerics<String>("테스트")

    //생략 가능
//    val generics = MyGenerics("테스트")

    //변수의 타입에 제네릭을 사용한 경우
//    val list1 : MutableList<String> = mutableListOf()
//
//    // 타입아규먼트를 생성자에서 추가
//    val list2 = mutableListOf<String>()
//
//    val list3 : List<*> = listOf<String>("테스트")
//    val list4 : List<*> = listOf<Int>(1,2,3,4)

    //pecs(producer-extends, consumer-super
    // 공변성은 자바 제네릭의 extends 코틀린에선 out
    // 반공변성은 자바 제네릭의 SUPER 코틀린에선 in

}