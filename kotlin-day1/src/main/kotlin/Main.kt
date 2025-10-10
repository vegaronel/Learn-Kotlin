import kotlin.reflect.typeOf

fun main() {
    // val cannot be re-assign or update the value
    val name : String = "Ronel"
    // var can be updated the value
    var age : Int = 24

    println("Hi i am $name. and i am $age years old ")


    //Operators - Int doesn't have any decimal numbers
    var x : Int = 23
    var y : Int = 5

    //Example of modulo
    println("modulo " + y % x) // result is 3



    // Increment and Decrement
    println("This is the old value of x: $x") // print old value
    println("This is the old value of y: $y") // print old value
    x++ // increase value of x with 1
    y-- // decrease value of y with 1

    // Print the new value
    println("This is the new value of X: $x and Y: $y")

    println("Please input a number")
    val input : String = readln();
    val convertedInput : Int? = input.toIntOrNull();


      fun checkValueofinput(convertedInput : Int?) : String {
          return when(convertedInput) {
              1 -> "Number is equal to 1"
              5 -> "Number is equal to 5"
              in 10..20-> "Number is between 10 and 20"
              else -> "BRO Please input a Number!"
          }
      }
    println(checkValueofinput(convertedInput))











}

