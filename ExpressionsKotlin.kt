package magdamiu.com.kotlinintro

/**
 * Created by magdamiu on 21/09/17.
 */

fun main(args: Array<String>) {
    val a = 4; val b = 7
    val max = if (a > b) {
        println("$a is grater than $b"); a
    } else {
        println("$b is grater than $a"); b
    }
    println(max)
    println(describe("GDG"))
    for (i in 1..10 step 2) {
        print("$i ")
    }}

fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Awesome"
        }
