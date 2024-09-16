package morefeatures

//Default constructor can also be defined
enum class Days(val num:Int){
    Monday(1),
    Tuesday(2),
    Wednesday(3),
    Thursday(4),
    Friday(5),
    Saturday(6),
    Sunday(7);

//    Methods can also be defined
    fun printFormatted(){
        println("Day is $this")
    }
}
//Every day is an instance or object of the days class
fun main(){
    val today = Days.Saturday
//    println(today.num)

//    for (i in Days.entries){
//        println(i)
//        println(i.num)
//    }

    today.printFormatted()
}
