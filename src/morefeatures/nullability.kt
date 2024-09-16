package morefeatures
fun main(){
    val age:Int ?= null
//    println(age)

//    Before using safe call explicit type declaration done
    val name:String ?= null

//    val presentName = if(name.length != null) 20 else -1
//    it can also written with elvis operator
    val presentName = name?.length?:-1
//    println(presentName)

    val myAddress:String? = "Ak"
//    Safe call operator
    println(myAddress?.length)
//    IT will output null

    println(myAddress!!.length)
//    It throes npe on giving null value
}