package morefeatures

data class Calc(val x:Int,val y:Int)

operator fun Calc.unaryMinus()=Calc(-x,-y)

val sum = Calc(10,20)

fun main(){
//    println(sum) Output -> Calc(x=10,y=20)

//    println(-sum) Output->receiver type mismatch

//    To solve this we use .unaryMinus() to make it so that we can get negative value of it
//    operator overloading is for using operator as a custom datatype
    println(-sum)
}