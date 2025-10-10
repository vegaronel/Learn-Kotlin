import kotlin.random.Random

fun main(args: Array<String>) {
    feedFish()
}

fun feedFish() {
    var day = randomDay()
    when(day) {
        "Sunday" -> println("The day today is $day and food of the fish is Pellet")
        "Monday" -> println("The day today is $day and food of the fish is Bread")
        "Tuesday" -> println("The day today is $day and food of the fish is Corn")
        "Wednesday" -> println("The day today is $day and food of the fish is Worm")
    }
}

fun randomDay() : String {
    val day = arrayOf("Sunday", "Monday", "Tuesday", "Wednesday")
    return day[Random.nextInt(day.size)]
}