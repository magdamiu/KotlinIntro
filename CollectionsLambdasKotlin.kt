package magdamiu.com.kotlinintro

/**
 * Created by magdamiu on 21/09/17.
 */
fun main(args: Array<String>) {
    listOf(1, 2, 3)
    mutableListOf("a", "b", "c")

    setOf(1, 2, 3)
    mutableSetOf("a", "b", "c")

    mapOf(1 to "a", 2 to "b", 3 to "c")
    mutableMapOf("a" to 1, "b" to 2, "c" to 3)

    val aList = listOf(1, 2, 4)

    println(aList.map { elem ->
        elem + 1
    })

    println(aList)

    println(aList.filter { it != 1 })

    fun sum(a: Int, b: Int) = a + b
    println(aList.reduce(::sum))
}