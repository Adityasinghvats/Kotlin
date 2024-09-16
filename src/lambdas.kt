

//Higher order function example
//fun main(){
////    Storing function in a variable
//    val fn:(a:Int,b:Int)->Int = ::sum
//    println(fn(45,56))
////    passing function to a function
//    println(addNumbers(87,98,::sum))
//}
//fun sum(a:Int,b:Int):Int = a+b
//fun addNumbers(a:Int,b:Int,sum:(a:Int,b:Int)->Int):Int{
//    return sum(a,b)
//}

//lambda are anonymous function
//lambda have same type as function
fun main(){

//    2 int lega aur ek int return krega but in case of fun return type
//            k matlab hota hain ki jb return krega to particular data type k hoga
//    val fn:(a:Int,b:Int)->Int = ::sum

    val lambda1 = {x:Int,y:Int -> x+y}
//    {body -> jo kam hoga}


//    Multiline lambda
//    last expression is the return type of lambda
    val multilambda2 = {
        println("Hello Aditya")
        val a:Int = 2+3
        "Hello"
    }

//    Call method same as function
    multilambda2()
    println(multilambda2)

//    Data type defined beforehand
    val sqr:(Int)->Int = {x -> x*x}
//    it is a single object iterator used in single param lambda
//    No need to give name to parameter because of it
    val sqr2:(Int)->Int = {it * it}

    val greet = {msg:String -> println("$msg received") }
    greet("I am here")

    println(sqr(4))
    println(sqr2(4))


//    When passing a lambda to a fun it should be called out of parenthesis
    val numbersAddition = addNumbers(6,89) { a, b -> a + b }
    println(numbersAddition)
}

//fun sum(a:Int,b:Int):Int = a+b
//
////Lambda for this function
//val sum = {a:Int,b:Int -> a+b}

fun addNumbers(a:Int,b:Int,sum:(a:Int,b:Int)->Int):Int{
   return sum(a,b)
}
