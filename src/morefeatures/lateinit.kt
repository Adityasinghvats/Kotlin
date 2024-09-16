package morefeatures

class Name{
    lateinit var myName:String
    fun initialisedOrNot(){
        println("Property Initialized:"+this::myName.isInitialized)
        myName = "Aditya Kumar"
        if(this::myName.isInitialized){
            println("Initialized")
        }
    }
}
fun main(){
    val name1 = Name()
    name1.initialisedOrNot()
}