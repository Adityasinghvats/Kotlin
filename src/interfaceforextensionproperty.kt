//interface name UpperCamelCase{
//    interface  body
//}
// class name : interface name{
//class body
//}
class Quizes:ProgressPrintable{
    override val progressText:String
        get() = "$answered of $total answered."

    override fun printProgressBar() {
        repeat(Quizes.answered) { print("▓") }
        repeat(Quizes.total - Quizes.answered) { print("▒") }
        println()
        println(progressText)
    }

//    Call properties of companion object without initialisation
//    Stores value specific to class
//    Can init interface as well
    companion object StudentProgress{
        var total:Int = 10
        var answered:Int = 3
    }
}
//Cannot initialize a property in an interface which is allowed in constructor
interface ProgressPrintable{
    val progressText:String
    fun printProgressBar()
}
fun main(){
    Quizes().printProgressBar()
    Quizes().progressText
    println(Quizes.total - Quizes.answered)
}