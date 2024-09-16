//A data class needs to have at least one parameter in its constructor, and all constructor parameters must be marked with val or var.
//A data class also cannot be abstract, open, sealed, or inner

data class Question <T> (
    val question:String,
    val answer:T,
    val difficulty:String
)

//Each possible value of an enum is called an enum constant.
// Enum constants are placed inside the curly braces separated by commas.
// The convention is to capitalize every letter in the constant name.
enum class Difficulty {
    EASY, MEDIUM, HARD
}


fun main() {
//    class TrueOrFalse(
//        val question: String,
//        val answer: Boolean,
//        val difficulty: String
//    )
//
//    class NumericType(
//        val question: String,
//        val answer: Int,
//        val difficulty: String
//    )
//
//    class FillInTheBlanks(
//        val question: String,
//        val answer: String,
//        val difficulty: String
//    )


//    To avoid this we use generic type
//    class (className)<generic type>(function body)
//    Inheritance can be used but every time we would have to create a new answer property
//    instead we use generic by just cHANGING THE DATA type


//    val question1 = Question<Boolean>("Earth is round?",true,"Easy")
//    val question2 = Question<Int>("Sum of 2 and 4?",6,"Easy")
//    val question3 = Question<String>("What is your name?","Aditya KUmar","Easy")

    val question1 = Question<Boolean>("Earth is round?",true, Difficulty.EASY.toString())
    val question2 = Question<Int>("Sum of 2 and 4?",6, Difficulty.HARD.toString())
    val question3 = Question<String>("What is your name?","Aditya KUmar", Difficulty.MEDIUM.toString())
    println("Question: "+question1.question)
    println("Answer: "+question1.answer)
    println("Difficulty: "+question1.difficulty)


//    Before converting into data class
//    println(question2.toString())
//    Question@17a7cec2

//    After converting we can perform operations on it
    println(question2.toString())
    println(question3.component1())
    println(question1.hashCode())
}
