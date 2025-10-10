fun main() {
    var result = getFare(45)
    if(result == null) {
        println("IMMORTAL KA NOY")
    }else{
        println(result)
    }
}

fun getFare(age : Int) : Double? {

    return when(age) {
        in 0..7 -> getDiscount(100.0)
        in 8..17 -> getDiscount(15.0)
        in 18..30 -> getDiscount(null)
        in 31..100 -> getDiscount(20.0)
        else -> null
    }
}


fun getDiscount(discount : Double?) : Double {
    var averageFare : Double = 25.0

    if(discount == null) {
        return averageFare
    }
    if(discount == 100.0){
        println("You are free of charge")
        return 0.0
    }

    return averageFare - discount / 100 * averageFare
}