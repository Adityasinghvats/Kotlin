fun printAll(vararg messages:String){
    for (message in messages){
        println(message)
    }
}
fun main(){
    printAll("Aditya","Aditi","Sakshi","Abhinav")
}