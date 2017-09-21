package magdamiu.com.kotlinintro

/**
 * Created by magdamiu on 21/09/17.
 */
object SingletonClass {
    fun getHello(): String = "Hello Singleton"
}

class CompaniedClass(val str: String) {
    companion object Printer {
        fun getHello(): String = "Hello Companion"
    }
}

class NoNameCompaniedClass(val str: String) {
    companion object {
        fun getHello(): String = "Hello No Name Companion"
    }
}

fun main(args: Array<String>) {
    SingletonClass.getHello() // Hello Singleton
    CompaniedClass.getHello() // Hello Companion
    NoNameCompaniedClass.getHello() // Hello No Name Companion
}
