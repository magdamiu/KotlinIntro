package magdamiu.com.kotlinintro

/**
 * Created by magdamiu on 21/09/17.
 */
data class CoordinateKotlin(var lat: Double, var lon: Double)

val city1 = CoordinateKotlin(24.5, 48.5)
val city2 = city1.copy(lat = 25.7)
fun main(args: Array<String>) {
    println(city1)
    println(city2)
}