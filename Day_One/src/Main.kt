

// classes and constructors
class User(var name : String, var email : String)

fun main(args : Array<String>) {
    println(args)


}
// switch statement
fun numberType(a : Int) {
    when(a){
        0 -> {
            println("Zero")
        }
        in 1..5 -> {
            println("Number is between 1 to 5")
        }
        in 6..10 -> {
            println("Number is between 6 to 10")
        }
    }
}


fun addNewUser(users: MutableList<User>, name : String, email : String){
    users.add(User(name, email))
    for(user in users){
        println("name: ${user.name}")
        println("email: ${user.email}")
        println("-------------------------------")
    }
}


fun addition(myName: String) {
    println(myName.length)
}

// create a function
fun sampleFunction() {
    println("This is a function")
}

// Single expression
fun sampleFunctionExpression(a : Int, b : Int): Int {
   return a + b
}

// if statements
fun controlStructures(a : Int, b : Int) {

    if(a > b) {
        println("$a is greater than $b")
    }else {
        println("$b is greater than $a")
    }
}



// loops
fun loops() {
    for(i in 20 downTo  1) {
        println(i)
    }

}

open class Person(var name: String ){
    open fun hello() = "Hello $name"
}

// Collection literals

fun myCollection() {
    var myList = listOf(1,2,3,4) // read only
    var myMutableList = mutableListOf(1,2,3,4) // cam be modified
    myMutableList.add(5) // add data

    var mySetOf = setOf("A", "B", "C")
    var myMutableSetOf = mutableSetOf<String>("A", "B", "C")

    var myArrayOf = arrayOf("a", "b", "c") // array char

    var myMapOf = mapOf("Ronel" to "ronelgvega@gmail.com" to "admin123", "John" to "johndoe@gmail.com" to "admin123")

    myMapOf.forEach{(key, value) ->
        println("Name: ${key.first}")
        println("Email: ${key.second}")
        println("Password: $value")
    }

}

