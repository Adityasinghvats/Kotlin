fun main(){
//    mutableMapof<key type, value type>()
//    val mapname = mapOf(
//    key to value,
//    key to value)
    val SolarSystem = mapOf(
        "Earth" to 1,
        "Jupiter" to 45,
        "Mars" to 23,
        "Venus" to 4,
        "Pluto" to 0
    )
    println(SolarSystem.size)
    println(SolarSystem.keys)
    println(SolarSystem.values)
    println(SolarSystem.entries)
    println(SolarSystem["Jupiter"])
    println(SolarSystem.get("Thiel"))
}