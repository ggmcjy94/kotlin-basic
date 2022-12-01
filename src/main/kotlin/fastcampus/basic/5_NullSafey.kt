package fastcampus.basic

import java.lang.NullPointerException

fun main () {

//    val a : String = null
//    var b : String = "aaadddd"
//    b = null

//    var a : String? = null
//    println( a?.length )
//
//    val b : Int = if (a != null) a.length else 0
//    println(b)
//
//    // 엘비스 연산자
//    val c : Int = a?.length ?: 0
//    println(c)

    //java Java_NullSafety 변환 코드

    val nullableStr = getNullStr()

    val nullableStrLength = nullableStr?.length ?: "null인 경우 반환".length
    println(nullableStrLength)

    val length = getLengthIfNotNull(null)
    println(length)

    // NPE 발생코드
    //throw NullPointerException()
//    val c : String? = null
//    val d = c!!.length // !! 이걸 쓰는 거는 무조건 널이 아니다 일때 씀
//    println(Java_NullSafety.getNullStr().length) // kotlin 에서 자바코드 쓸때 null 처리 잘해야됌


}

fun getNullStr() : String? = null

fun getLengthIfNotNull(str: String?) = str?.length ?: 0 // 널인 경우 0 반환