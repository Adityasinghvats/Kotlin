//Singleton Object example
//object StudentProgress{
//    var total:Int = 10
//    var answered:Int = 3
//}
//fun main(){
//    println("Out of ${StudentProgress.total} questions ${StudentProgress.answered} were answered.")
//}

//Companion object example

class Questions<T>(
    val question:String,
    val answer:T,
    val difficulty: String
)
enum class DifficultyLevel{
    TOUGH,MEDIUM,EASY
}
class Quiz{
    val questionA = Questions<String>("How are you","Fine",DifficultyLevel.EASY.toString())
    companion object StudentProgress{
        var total:Int = 10
        var answered:Int = 3
    }
}

//Extension property
//val type name.property name : data type getter()
//Extension properties can't store data, so they must be get-only
val Quiz.StudentProgress.progressText:String
    get() = "${answered} of ${total} answered."


//Extension function
// fun type name . function name (parameters) : Return type{ function body}

fun Quiz.StudentProgress.printProgressBar(){
    repeat(Quiz.answered) { print("▓") }
    repeat(Quiz.total - Quiz.answered) { print("▒") }
    println()
    println(Quiz.progressText)

}
fun main(){
    println("${Quiz.answered} questions were answered out of ${Quiz.total}.")
    Quiz.printProgressBar()
}




