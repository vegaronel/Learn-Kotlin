fun main() {
    var circle = Circle(25,2,41)
    circle.area()
}

//Activity 1: Simple Inheritance
open class Shape(val size : Int, val radius : Int, val length : Int) {

    //Create a base class Shape with a method area().
    open fun area() {
        println("The area of this shape is \nSize:$size\nRadius:$radius\nLength:$length")
    }
}
//Create two subclasses: Circle and Rectangle.
class Circle(size : Int, radius : Int, length : Int) : Shape(size,radius,length) {
    //Override the area() method in each subclass.
    override fun area() {
        println("The area of this Circle is \nSize:$size\nRadius:$radius\nLength:$length")
    }
}
class Rectangle(size : Int, radius : Int, length : Int) : Shape(size,radius,length) {
    override fun area() {
        println("The area of this Rectangle is \nSize:$size\nRadius:$radius\nLength:$length")
    }
}



fun Sample() {
    val numbers = arrayOf(1, 2, 3, 4, 5, 6)

    var even = numbers.filter {
        it % 2 == 0
    }

    var toOdd = even.map {
        it + 1
    }

    toOdd.forEach {
        println(it)
    }

    println("\n")

    numbers.asSequence().filter {
        it % 2 == 0
    }.map {
        it + 1
    }.forEach {
        println(it)
    }



}






