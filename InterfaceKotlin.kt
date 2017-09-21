package magdamiu.com.kotlinintro

/**
 * Created by magdamiu on 21/09/17.
 */

interface GDG {
    val name: String
    fun getCity(): String
}

class GDGPitesti: GDG{
    override val name: String = "GDG"
    override fun getCity(): String = "$name Pitesti"
}

fun main(args: Array<String>) {
    println(GDGPitesti().getCity())
}