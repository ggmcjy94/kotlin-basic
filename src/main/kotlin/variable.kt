import java.util.Scanner
import kotlin.math.max
import kotlin.random.Random

class variable {


}
const val num1 = 20; // 메인 보다 먼저 컴파일
val num = 20 // 상수는 불가능 자바에 final 동일
fun main() {
    var i : Int = 10
    var name : String = "lee"
    var avg : Double = 1.0
    i = 30; // 변수는 재대입 가능
//    num = 30;

    var i2 = 10
    var l = 20L
    l = i2.toLong() // 타입 캐스팅
    i2 = l.toInt()

    var name2 = "10"
    i2 = name2.toInt()

    var name3 = "hello"
    println(name3.uppercase())
    println(name3.lowercase())
    println("제 이름은 " + name3 + " 입니다.")
    println("제 이름은 ${name3 + 10} 입니다")
    var q = 10
    var w = 20
    println(max(q, w))

    var randomNumber = Random.nextInt(0, 100)// 0 ~ 99
    println(randomNumber)

//    val reader = Scanner(System.`in`)
//    reader.nextInt()
//    reader.next()

    
}