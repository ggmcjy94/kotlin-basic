package fastcampus.basic

fun main() {
    // if ... else 사용
    val job = "Software Developer"

    if (job == "Software Developer") {
        println("개발자")
    } else {
        println("개발자 아님")
    }


    //코틀린의 if ... else 표현식
    val age  = 10
    val str = if (age > 10) {
        "성인"
    } else {
        "아이"
    }

    //코틀린은 삼항 연사자가 없음
    val a = 1
    val b = 2
    var c = if (b > a) b else a

}