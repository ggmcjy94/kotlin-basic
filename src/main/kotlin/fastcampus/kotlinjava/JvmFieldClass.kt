package fastcampus.kotlinjava

class JvmFieldClass {

    companion object{
        @JvmField
        val id = 1234

        const val CODE = 1234
    }
}

object JvmFieldObject {

    val name = "tony"

    const val FAMILY_NAME = "stark"
}

fun main() {
    val id = JvmFieldClass.id
    val name = JvmFieldObject.name

}