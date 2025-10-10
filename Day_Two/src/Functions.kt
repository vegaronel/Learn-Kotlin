fun main() {

    println("input in celsius")
    val celsius = readln().toDouble()
    val fahrenheit=  temperatureConverter(celsius)
    println("Celsius : $celsius converted to Fahrenheit: $fahrenheit")


multiplicationTable(18)


}

fun greet(name : String, age : Int) : String {
    println("Hello $name")
    if(age >= 20) {
        return "OKAY YOU ARE NOT A MINOR"
    }else{
        return "YOU ARE A MINOR"
    }

}

fun oddEven() {
    try {
        val input = readln().toInt()
        if(input % 2 == 0) {
            println("EVEN")
        }else{
            println("ODD")
        }

    }catch (e : Exception) {
        println("Please input a valid number")
    }
}

fun temperatureConverter(celsius : Double) : Double {
    val fahrenheit = (celsius * 9/5) + 32
    return fahrenheit
}

fun multiplicationTable(input : Int) {
    val multiplyUpTo = 10
    for (i in 1..multiplyUpTo) {
        println("$i * $input = ${i*input}")
    }

}
