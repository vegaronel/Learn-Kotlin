fun main() {

}

fun ifStatements() {
    val numberOfFish = 50
    val numberOfPlants = 23
    if (numberOfFish > numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }
}

fun rangeStatement() {
    val fish = 33
    if(fish <= 0 ) {
        println("There is no fish in this tank.")
    }
    else if(fish < 40) {
        println("Got fish")
    }
    else {
        println("There is a lot of fish")
    }
}

fun switchStatement() {
    val numberOfFish = 50
    when(numberOfFish) {
        0 -> println("No fish")
        in 1..40 -> println("There is some fish")
        else -> println("There is a lot of fish.")
    }
}

fun nullability() : Int? {
    var fishCount : Int? = 23
    if(fishCount != null) {
        println("There is a fish")
    }else{
        println("I think the value is null")
    }
    return fishCount

}