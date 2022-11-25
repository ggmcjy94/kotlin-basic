class 반복문 {
}

fun main() {
    val items = listOf(1,2,3,4,5)

//    items.forEach{ item -> println(item) }
//    for (item in items) {
//        println(item)
//    }

    //for (int i = 0 ; i < items.size ; i++)
//    for (i in 0..(items.size - 1)) {
//        println(items[i])
//    }

    val items2 = mutableListOf(1,2,3,4,5) // 변경 가능
//    items2.add(6)
//    items2.remove(3)
//    for (item in items2) {
//        println(item)
//    }

    val items3 = arrayOf(1,2,3) // 베열
    items3[0] = 10
    items3[1] = 20
    for (i in items3) {
        println(i)
    }

}