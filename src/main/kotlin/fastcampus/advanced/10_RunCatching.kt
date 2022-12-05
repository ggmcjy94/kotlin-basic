package fastcampus.advanced

fun getStr() : Nothing = throw Exception("예외 발생 기본 값으로 초기화")

fun main() {

//    val result = try {
//        getStr()
//    } catch (e : Exception) {
//        println(e.message)
//        "기본값"
//    }


//    val result = runCatching { getStr() }
//        .getOrElse {
//            println(it.message)
//            "기본값"
//        }

//    val result = runCatching { "성공" }
//        .getOrNull()

//    val result = runCatching { getStr() }
//        .exceptionOrNull()
//
//    result?.let {
//        println(it.message)
//        throw it
//    }

//    val result = runCatching { getStr() }.getOrDefault("기본값")


//    val result = runCatching { getStr() }.getOrElse {
//        println(it.message)
//        "기본 값"
//    }

//    val result: String = runCatching { "성공" }.getOrThrow() // 널이거나 예외일때 컴파일시 잡아줌

//    val result:String = runCatching { "안녕" }.map { "${it}하세요" }.getOrThrow()

    // map 안에서 에러 발생시 getOrDefault 안감 대신 map -> mapCatching 해주면 잡아줌
//    val result:String = runCatching { "안녕" }.mapCatching { throw Exception("예외") }.getOrDefault("기본값")

//    val result = runCatching { getStr() }
//        .recover {
//            "복구"
//            //for
//            //if
//    }.getOrNull()

    val result = runCatching { getStr() }
        .recoverCatching {
            throw Exception("예외")
        }.getOrDefault("복구")

    println(result)
}