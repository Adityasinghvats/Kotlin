fun main(){
    val smallPlanets = arrayOf("Earth","Pluto","Venus","Mars")
    val largePlanets = arrayOf("Jupiter","Saturn","Mercury")
    val planets = smallPlanets + largePlanets
    for (i in 0..6){
        println(planets[i])
    }
    smallPlanets[0] = "Moon"
    println(smallPlanets[0])
}