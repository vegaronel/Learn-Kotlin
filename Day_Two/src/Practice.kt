
import java.util.Random

fun main() {
    feedFish()
}

fun getFood() : List<String> {
    val day = getRandomDay()
    var food : String = ""

    food = when(day) {
        "Sunday" -> "pellets"
        "Monday" -> "bread"
        "Tuesday" -> "mosquito larvae"
        "Wednesday" -> "black worms"
        "Thursday" -> "daphnia"
        "Friday" -> "gammarus"
        "Saturday" -> "blood worms"
        else -> {
            ""
        }
    }

    return listOf(food, day)
}


// make a random day generator
fun getRandomDay() : String {
    val days = listOf("Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")

    return days[Random().nextInt(days.size)]
}

fun feedFish() {
    val (food, day) = getFood()
    val message = "The day today is $day. I will feed the fish with $food"
    println(message)
}