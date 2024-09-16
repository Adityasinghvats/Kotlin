fun main(){
   fun add(num1:Int,num2:Int) = num1 + num2
//    val result = add(4,93)
//    println(result)

//Checking in range or not
//    val number:Int = 5
//    val result = number in 1..100
//        println(result)

//    val num = 2
//    for (i in 1..100 step 10){
//        println("$num*$i=" + num*i)
//    }

//    Using add as a data
//    val fn = ::add
//    println(fn(4,8))

    fun findGreatest(num1:Int,num2:Int) = if(num1>num2) num1 else num2
    val result = ::findGreatest
    println(result(5,9))
}