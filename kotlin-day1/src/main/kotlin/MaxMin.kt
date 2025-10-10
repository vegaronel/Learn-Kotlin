fun main() {
    val numbers = arrayOf(23, 12, 5, 23, 12, 84, 0, 87, 12, 67, 23, 53, 6)

    val minMax = findMinMax(numbers)
    println("Min ${minMax[1]}")
    println("Max ${minMax[0]}")
}

fun findMinMax(numbers: Array<Int>) : Array<Int> {
    var currentLowest : Int = 0
    var currentHigest : Int = 0
    for (i in numbers) {

        if(currentLowest != 0 || currentHigest != 0) {
            if(currentLowest > i) {
                currentLowest = i
            }
            if(currentHigest < i) {
                currentHigest = i
            }
        }else {
            currentLowest = i
        }

    }
    return arrayOf(currentHigest, currentLowest)

}