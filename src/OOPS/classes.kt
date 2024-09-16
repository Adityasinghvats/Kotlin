//if we val or var inside constructor it is a property
//if not written it is simply a parameter
class Cars(val name:String,hasAirbags:Boolean){
//    When an object is created it executes
    init {
        println("$name object created")
    }
//    A property of class using passed parameter
    var airbags = hasAirbags
    fun engine(){
        if(airbags){
            println("Engine of $name started with $noOfWheels wheels")
        }
    }

    var noOfWheels:Int = 0
    constructor(name: String,hasAirbags: Boolean,wheels:Int):this(name,hasAirbags){
        this.noOfWheels = wheels
    }
}

class Vehicle(val name:String,val hasAirbags:Boolean){
    constructor(nameparam:String,modelparam:Int):this(nameparam,true){
    }
//    method cannot be initialised inside any constructor
    fun engine(){
        println("Engine of $name started!")
    }
}
fun main(){
    val car1 = Cars("Marti",true)
    println(car1.engine())
    println(car1.airbags)

    val car2 = Vehicle("Scorpio",true)

//    Ek hi vehicle class se inherited hain pr extra property k liye secondary constructor bnaya
    val car3 = Vehicle("Bolero",2013)

    val car5 = Cars("XuV",true,5)
    println(car5.engine())

}