val age = 24

fun main() {
    var name : String? = null

    var list = arrayOf("Hello", "World", "!")

    var myList = listOf("Apple", "Banana", "Car", "Dog", "Elephant")




    var result = myList.filter {
        it.length == 3
    }

    println(result)


//    println(getAge(age))
//    sum(2,4)
//
//
//    for(i in 0..99) {
//        println(i)
//    }
//
//    println(oddEven(76))
}

fun getAge(age : Int) : Int {
    return age
}

fun sum(a : Int, b : Int) : Int {
    return a + b
}

fun oddEven(num : Int) : String{
    if (num % 2 == 0) {
        return "Even"
    } else {
        return "odd"
    }
}

fun getName(name : String? = "Unknown") : String? {
    return name
}