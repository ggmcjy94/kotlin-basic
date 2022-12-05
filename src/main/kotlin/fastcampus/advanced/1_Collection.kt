package fastcampus.advanced

import java.util.LinkedList
import java.util.stream.Collectors

fun main() {
    // immutable
    val currencyList = listOf("달러", "유로", "원")
//    currencyList.add() x

    // mutable
//    val mutableCurrencyList = mutableListOf<String>()
//    mutableCurrencyList.add("달러")
//    mutableCurrencyList.add("유로")
//    mutableCurrencyList.add("원")

    val mutableCurrencyList = mutableListOf<String>().apply {
        add("달러")
        add("유로")
        add("원")
    }

    // immutable set
    val numberSet = setOf(1,2,3,4)

    //mutable set
    val mutableSet = mutableSetOf<Int>().apply {
        add(1)
        add(2)
        add(3)
        add(4)
    }

    // immutable map
    val numberMap = mapOf("one" to 1, "two" to 2)

    //mutable map
    val mutableMap = mutableMapOf<String, Int>()
    mutableMap["one"] = 1
    mutableMap["two"] = 2
    mutableMap["three"] = 3


    //collection builder {내부에서는 mutable} 반환은 immutable
    val numberList: List<Int> = buildList {
        add(1)
        add(2)
        add(3)
    }

    // linked list
    val linkedList = LinkedList<Int>().apply {
        addFirst(3)
        add(2)
        addLast(1)
    }

    //arrayList
    val arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }


//    val iterator = currencyList.iterator()
//    while (iterator.hasNext()) {
//        println(iterator.next())
//    }
//
//    println("===================")
//
//    for (currency in currencyList) {
//        println(currency)
//    }
//
//    println("===================")
//
//    currencyList.forEach{
//        println(it)
//    }

    // for loop -> map
    val lowerList = listOf("a","b","c")
//    val upperList = mutableListOf<String>()

//    for (lowerCase in lowerList) {
//        upperList.add(lowerCase.uppercase())
//    }

    val upperList = lowerList.map { it.uppercase() }

//    val filteredList = mutableListOf<String>()
//    for (upperCase in upperList) {
//        if (upperCase == "A" || upperCase == "C") {
//            filteredList.add(upperCase)
//        }
//    }

    val filteredList = upperList
        .asSequence() // 이렇게 사용하면 개별적으로 filter 를 생성 하는것이 아니어서 메모리 낭비를 하지않을 수 있음 100 만건 ?
        .filter { it == "A" || it == "C" }
        .filter { it == "A" || it == "C" }
        .filter { it == "A" || it == "C" }
        .filter { it == "A" || it == "C" }
        .filter { it == "A" || it == "C" }
        .toList()
    println(filteredList)



}