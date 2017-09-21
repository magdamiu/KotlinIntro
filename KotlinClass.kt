package magdamiu.com.kotlinintro

/**
 * Created by magdamiu on 20/09/17.
 */


class KotlinClass(var name: String) {
    lateinit var gdg: GDGPitesti
    val language: String

    init {
        language = "Kotlin"
    }

    fun initializeName (name: String) {
        gdg = GDGPitesti(name)
    }

    inner class GDGPitesti(val text: String)

    fun sayItFromGDG(): String = "${gdg.text} $name $language"
}

fun main(args: Array<String>) {
    var a = KotlinClass("loves")
    a.initializeName("GDG Pitesti")
    print(a.sayItFromGDG())
}