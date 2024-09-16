package OOPS

/*
Ek class ke andar aise methods jo skte hain jisko hm waha define nahi kare ,
but jo subclasses hain wo usko define kare then we use abstract methods.
Abstract methods and property can exist only within a abstract class.
Function body / intialisation ki bina hain to abstract hi hona chaiye.
Abstract classes ki instances nahi bana skte sirf inherit hogi
Usage -> class ki koi instance/object nahi bana sake bs usko inherit karke use kiya jaa sake
* */
abstract class House(val land:Int){
    fun area(){
        println(land)
    }
    abstract fun Name():String
    abstract fun landArea()
}
class Villa(val naam:String):House(90){
    override fun Name(): String = naam
    override fun landArea() {
        println(land)
    }
}
fun main(){
    val myhome = Villa("Namma")
    println(myhome.naam)
    println(myhome.Name())
    println(myhome.land)
    myhome.area()
    myhome.landArea()

}