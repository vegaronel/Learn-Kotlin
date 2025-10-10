fun swim(speed : String = "fast"){
    println("swimming $speed")
}

fun shouldChangeWater(day : String, temperature : Int = 44, dirty : Int = 20) : Boolean{
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) : Boolean {
    return temperature > 30
}
fun isDirty(dirty: Int) : Boolean {
    return dirty > 30
}
fun isSunday(day: String) : Boolean {
    return day == "Sunday"
}