package magdamiu.com.kotlinintro

/**
 * Created by magdamiu on 21/09/17.
 */
data class Coordinate(var lat: Double, var lon: Double)

fun main(args: Array<String>) {
   val city1 = Coordinate(24.5, 48.5)

   //copy
   val city2 = city1.copy(lat = 25.7)
  
   //component
   val (theLat, theLon) = city2
  
   println(city1)
   println(city2)
   println(theLat)
   println(theLon)
}
