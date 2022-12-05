package fastcampus.advanced

import javax.print.attribute.standard.MediaSize.Other

sealed class Developer {
    abstract val name:String
    abstract fun code(language:String)
}

data class BackendDeveloper(override val name:String) :Developer() {
    override fun code(language: String) {
        println("저는 백엔드 개발자입니다. ${language}를 사용합니다.")
    }

}


data class FrontendDeveloper(override val name:String) :Developer() {
    override fun code(language: String) {
        println("저는 프론트엔드 개발자입니다. ${language}를 사용합니다.")
    }

}

data class AndroidDeveloper(override val name:String) :Developer() {
    override fun code(language: String) {
        println("저는 안드로이드  개발자입니다. ${language}를 사용합니다.")
    }

}

data class IosDeveloper(override val name:String) :Developer() {
    override fun code(language: String) {
        println("저는 ios 개발자입니다. ${language}를 사용합니다.")
    }

}

object OtherDeveloper : Developer() {
    override val name: String = "익명"

    override fun code(language: String) {
        TODO("Not yet implemented")
    }

}



//싱글톤
object DeveloperPool {

    val pool = mutableMapOf<String, Developer>()

    fun add(developer: Developer) = when(developer) {
        is BackendDeveloper -> pool[developer.name]= developer
        is FrontendDeveloper -> pool[developer.name] = developer
        // else 가 없어도 컴파일 오류가 안남 이유는 sealed class 자체 하위 클래스를 인식 해줌 대신 같은 패키지내에 있어야됌
        is OtherDeveloper -> println("지원하지않는 개발자종류입니다.")
        is AndroidDeveloper -> pool[developer.name] = developer
        is IosDeveloper -> pool[developer.name] = developer
    }

    fun get(name:String) = pool[name]

}




fun main () {

    val backendDeveloper = BackendDeveloper(name = "lee")
    DeveloperPool.add(backendDeveloper)

    val frontendDeveloper = FrontendDeveloper(name = "카즈하")
    DeveloperPool.add(frontendDeveloper)

    val androidDeveloper = AndroidDeveloper(name = "나니")
    DeveloperPool.add(androidDeveloper)

    println(DeveloperPool.get("lee"))
    println(DeveloperPool.get("카즈하"))
    println(DeveloperPool.get("나니"))

}
