package fastcampus.advanced

fun main() {
    val str : String? = "안녕"

    val result : Int? = str?.let {
        println(it)

        val abc : String? = "abc"
        val def : String? = "def"
        if (!abc.isNullOrEmpty() && !def.isNullOrEmpty()) {
            println("abcdef 가 널이 아님")
        }

        1234 // return
    } // 함수의 결과를 반환

    println(result)

    val hello = "hello"
    val hi = "hi"

    // 이렇게 사용 it 으로 하면 가독성 떨어짐
    hello.let { a:String ->
        println(a.length)

        hi.let { b:String ->
            println(b.length)
        }
    }
}