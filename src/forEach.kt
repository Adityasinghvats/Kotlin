//You can loop over each element in a collection using forEach().
//Expressions can be inserted into strings.
//map() is used to format the items in a collection, often as a collection of another data type.
//filter() can generate a subset of a collection.
//groupBy() splits a collection based on a function's return value.
//fold() turns a collection into a single value.
//sortedBy() is used to sort a collection by a specified property

class Car(
    val name:String,
    val modelYear:Int,
    val brand:String,
    val reliable: Boolean
)

val cars = listOf(
    Car("Safari",2010,"Tata",false),
    Car("Bolero",2013,"Mahindra",true),
    Car("Scorpio",2018,"Mahindra",true)
    )
fun main(){
//    cars.forEach{
//        println("Brand Name: ${it.name}")
//    }
//    cars.forEach{
//        println("Year: ${it.modelYear}")
//    }
//    cars.forEach{
//        println("Brand Name: ${it.brand}")
//    }


//    Create a new collection with the desired changes to items of last collections
//    val fullCatalogue = cars.map {
//        "${it.brand}-${it.name}"
//    }
//    println("Catalogue:")
//    fullCatalogue.forEach {
//        println(it)
//    }

// Filter objects base on the bool value of a attribute of that class
//    val reliableCars = cars.filter {
//        it.reliable
//    }
//    println("Reliable Cars:")
//    reliableCars.forEach {
//        println("${it.name} reliability is ${it.reliable}.")
//    }


//    Group by
//    val reliableCars = cars.groupBy { it.reliable }
//    val reliableFor = reliableCars[true] ?: listOf()
//    val notReliable = reliableCars[false] ?: listOf()
//    println("Reliable Cars:")
//    reliableFor.forEach {
//        println("${it.brand}-${it.name}")
//    }
//    println("Not reliable:")
//    notReliable.forEach {
//        println("${it.brand}-${it.name}")
//    }


//    Sort by () sort according to property given
//    val sortedByAge = cars.sortedBy {
//        it.modelYear
//    }
//    println("Sorted by year:")
//    sortedByAge.forEach {
//        println("${it.name}-${it.modelYear}")
//    }

//    Fold() add all elements of that type
//    The fold() function takes two parameters:
//
//An initial value. The data type is inferred when calling the function (that is, an initial value of 0 is inferred to be an Int).
//A lambda expression that returns a value with the same type as the initial value.
//The lambda expression additionally has two parameters:
//
//The first is known as the accumulator. It has the same data type as the initial value. Think of this as a running total. Each time the lambda expression is called, the accumulator is equal to the return value from the previous time the lambda was called.
//The second is the same type as each element in the collection


//    val totalAge = cars.fold(0){
//        total, cars -> total+cars.modelYear
//    }
//    println("Total Age: ${totalAge}")

    val sortedCars = cars.sortedBy {
        Car -> Car.modelYear
    }
    sortedCars.forEach {
        Car -> println(Car.name)
    }
}