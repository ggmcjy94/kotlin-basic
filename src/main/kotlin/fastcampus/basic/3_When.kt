package fastcampus.basic

fun main() {
    // when == switch
    val day = 2
    val result: String = when (day) {
        1 -> "월"
        2 -> "화"
        3 -> "수"
        4 -> "목"
        else -> "기타"
    }

    when(getColor()) {
        Color.RED -> println("red")
        Color.GREEN -> println("green")
        else -> println("blue")
    }

    when(getNumber()) {
        0, 1 -> println("0 또는 1")
        else -> println("0 또는 1 아님 ")
    }

}

enum class Color {
    RED, GREEN, BLUE
}
fun getColor() = Color.RED

fun getNumber() = 2