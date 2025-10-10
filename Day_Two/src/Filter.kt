fun main() {
    var flowers = listOf("Sunflower", "Daisy", "Rose", "Tulip", "Iris", "Lily", "Lavender")

    searchFunction(flowers)


}


fun searchFunction(flowers : List<String>) {
    println("Please type in your input to search")
    var input = readln()

    var search = flowers.filter { it.lowercase() == input }

    if(!search.isEmpty()) {
        search.forEach {
            println("$it is existing.")
        }
    }else {
        println("there is no such $input")
    }


}



fun gradingSystem() : String {

    val grade = readln().toInt()

    return when{
        grade in 90..100 -> "Passed!... 1.5"
        grade in 85..90 -> "Passed!... 2"
        grade in 80..85 -> "Passed!... 3"
        grade > 101 -> "Invalid"
        else -> "Failed"
    }
}