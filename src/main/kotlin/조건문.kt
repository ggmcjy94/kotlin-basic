class 조건문 {
}

fun main() {
    var i = 11

    if (i > 10) {
        println("10 보다 크다")
    }
    else if (i < 10) {
        println("10 보다 작다 ")
    }
    else {
        println("")
    }

    var result1 = when {
        i < 10 -> "10 보다 작음"
        i > 10 -> "10 보다 큼"
        else ->"!!!!"
    }

    var result = if (i > 10) {
        "10 보다 크다"
    } else if (i < 10) {
        "10 보다 작다"
    } else {
        "!!!!"
    }

    //boolean result = i > 10 ? true : false;
    val result3 = if (i > 10) true else false


}