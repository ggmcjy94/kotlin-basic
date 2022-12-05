package fastcampus.advanced


// 스코프 함수 유의 할점 팀내 규칙에 따라 잘 사용 해야됌

class User(val name :String, val password:String) {
    fun validate() {
        if (name.isNotEmpty() && password.isNotEmpty()) {
            println("검증 성공")
        } else {
            println("검증 실패")
        }
     }

    fun printName() = println(name)
}


fun main () {

    User(name = "lee", password = "1234").also {
        it.validate()
        it.printName()
    }

}