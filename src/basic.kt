fun main(){
    println("Enter your name")
    val name = readlnOrNull()
    println("Name is $name")
    for (i in 1..10) println(i)

    val num = 2
    val pow = 5
    var result = 1
    for(i in 1..pow){
        result *= num
    }
    println(result)
}