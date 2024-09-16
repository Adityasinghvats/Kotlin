//A list is an ordered, resizable collection, typically implemented as a resizable array.
//When the array is filled to capacity and you try to insert a new element,
//the array is copied to a new bigger array.
fun main() {
//    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
//    println(solarSystem.size)
//    println(solarSystem[5])
//    println(solarSystem.get(5))
//    println(solarSystem.indexOf("Earth"))
//    println(solarSystem.indexOf("Pluto"))
//    for (item in solarSystem){
//        println(item)
//    }

    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystem.add("Pluto")
    solarSystem.add(4,"Moon Hobe")
    for (planet in solarSystem){
        println(planet)
    }
    println()
    solarSystem.remove("Moon Hobe")
    solarSystem.removeAt(8)
    for (planet in solarSystem){
        println(planet)
    }
    println()
    println("Pluto" in solarSystem)
}