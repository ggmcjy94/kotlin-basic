package fastcampus.advanced


class `7_LateInit` {

    lateinit var text : String

    val textInitialized:Boolean
        get() = this::text.isInitialized
    fun printText() {
//        text = "안녕하세요"
//        if (this::text.isInitialized) { // 클래스 내부에서만 사용가능
//            println("초기화됌")
//        } else {
//            text = "안녕하세요"
//        }
        println(text)
    }
}

fun main () {
    val test = `7_LateInit`()
    if (!test.textInitialized) {
        test.text = "하이요"
    }
    test.printText()
}