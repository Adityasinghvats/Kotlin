package morefeatures

//Example we want to make an app with 4 diff tiles with diff graphics on them
//But enum class doesn't allow to make changes after it has been created
//So we used sealed class
//Enum restricts values , sealed restricts types of value
//Enum has one type of object only ,means all have same state
//Sealed class can have multiple objects and consequently multiple states of those objects

fun main(){
//    val tile = Red("mushroom",30)
//    val tile2 = Red("dragon",50)
//    println("${tile.type} with ${tile.point}")

    val tile:Tiles = Red("Dragon",25)
    val tile2:Tiles = Blue(45)
    val points = when(tile){
        is Red -> tile.point*2
        is Blue ->tile.points*2
        else -> {""}
    }
    println(points)
}

//sealed class is an abstract class we cannot make objects of it outside of it
sealed class Tiles{}
class Red(val type:String,val point:Int):Tiles()
class Blue(val points:Int):Tiles()
object message:Tiles()
data class Units(val unit:Int ):Tiles()