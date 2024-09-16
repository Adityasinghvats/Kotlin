import java.lang.IllegalArgumentException

//Example database connection is not available
fun main(){
    val nums = arrayOf(1,2,3,4)

//    Iske andar wo code jisme error aa skti hain
//    iske sath ya to catch ye finally likha hoga
    try {
        println(nums[5])
        println(nums[2])
    }

//    Multiple catch block bana skte hain multiple type of error handle krne k liye
//    phle specific error wla catch aur finally exception last hoga
    catch (nl:NullPointerException){
        println(nl)
    }

    catch (e:Exception){
        println("Please check index")
    }

//    error aye ya na aye ye execute hoga
    finally {
        println("I will execute no matter what")
    }

    createUserList(6)
    createUserList(-2)
}

fun createUserList(user:Int){
    if(user<0){
        throw IllegalArgumentException("Enter correct value")
    }
    else{
        println("$user users created")
    }
}