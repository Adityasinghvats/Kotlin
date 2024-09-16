package morefeatures

class Human(val name:String,val age:Int){
    init {
        println("Object Created")
    }
}
fun main(){
    val rahul = Human("Rahul",90)
    val ajay = rahul.age
}