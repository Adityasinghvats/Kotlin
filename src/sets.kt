//Set is a collection that has no specific order and not duplicate elements
////Each class in Kotlin has a hashcode() method to store a int value of hashcode to identify
//A set uses hash codes as array indices. Of course,
//there can be about 4 billion different hash codes, so a Set isn't just one giant array.
//Instead, you can think of a Set as an array of lists.
fun main(){
    val SolarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(SolarSystem.size)
    SolarSystem.add("Pluto")
    println(SolarSystem.size)
    println(SolarSystem.contains("Earth"))
    println(SolarSystem.count())
    println(SolarSystem.hashCode())
    println("Earth" in SolarSystem)
}
