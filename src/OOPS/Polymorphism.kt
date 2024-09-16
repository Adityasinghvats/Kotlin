package OOPS

fun main(){
    val myShape:Shape = Circle(6.5)
    val shape2:Shape = Square(9.0)

    val shapes = arrayOf(Circle(4.5),Circle(3.5),Square(7.8), Shape(),Triangle(4.5,5.0))
    showShapes(shapes)
}
fun showShapes(shapes:Array<Shape>){
    for(shape in shapes){
        println(shape.area().toInt())
    }
}
open class Shape{
    open fun area():Double{
        return 0.0
    }
}
class Circle(val radius:Double): Shape() {
    override fun area():Double {
        return Math.PI*radius*radius
    }
}
class Square(val side:Double): Shape() {
    override fun area():Double{
        return side*side
    }
}
class Triangle(val base:Double,val height:Double):Shape(){
    override fun area(): Double = 0.5*base*height
}
