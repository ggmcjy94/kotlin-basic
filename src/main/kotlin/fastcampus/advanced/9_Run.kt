package fastcampus.advanced

class DatabaseClient {
    var url : String? = null
    var username : String? = null
    var password : String? = null


    fun connect() : Boolean {
        println("DB 접속중 ....")
        Thread.sleep(1000)
        println("DB 접속 완료")
        return true
    }
}


fun main() {

//    val config = DatabaseClient()
//    config.url = "localhost:3306"
//    config.username = "mysql"
//    config.password = "1234"
//    val connected = config.connect()


    val connected : Boolean = DatabaseClient().run {
        this.url = "localhost:3306"
        this.username = "mysql"
        this.password = "1234"
        connect()
    }

//    val connected1 : Boolean = DatabaseClient().let {
//        it.url = "localhost:3306"
//        it.username = "mysql"
//        it.password = "1234"
//        it.connect()
//    }

//    val result : Boolean = with(DatabaseClient()) {
//        this.url = "localhost:3306"
//        this.username = "mysql"
//        this.password = "1234"
//        connect()
//    }

    println(connected)
}