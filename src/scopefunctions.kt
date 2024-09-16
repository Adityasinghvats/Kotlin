
class Quizz{
    private val question1 = Question<String>("How are you","Fine",DifficultyLevel.EASY.toString())
    private val question2 = Question<Int>("Sum of 2 and 4?",6, Difficulty.HARD.toString())
    private val question3 = Question<String>("What is your name?","Aditya Kumar", Difficulty.MEDIUM.toString())
    fun printQuiz(){
        question1.let {
            println(it.question)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.question)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.question)
            println(it.answer)
            println(it.difficulty)
        }
    }
}
fun main(){
    val quiz = Quizz()
    quiz.printQuiz()

    println()
////    Instead of creating an object and then accessing directly use by apply
//    Quizz().apply {
//        printQuiz()
//    }

    Quizz().also {
        println("Adding to list")
            .apply {
                val question4 = Question<Boolean>("Kaise ho?",true,Difficulty.EASY.toString())
            }
    }
}