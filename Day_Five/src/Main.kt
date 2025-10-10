
fun main() {

    OuterLoop@ for (i in 0..3) {
        InnerLoop@ for(j in 0..3) {
            if(i == 1) {
                break@OuterLoop
            }
            println("i = $i and j = $j")

        }
    }

 }

fun whenExpression(age : Int) : String {
    return when {
        age in 0..20 -> "You cant pass"
        age in 21..40 -> "You can pass."
        age in 40..100 -> "You are overage"
        else -> "Invalid age"
    }
}

fun loopExpression(count : Int) {
    println("Multiplication Table")
    for(i in 1..10 ) {
        println("$count * $i = ${count * i}")
    }
}

fun whileExpression(count : Int) {
    var i = 0
    while (i < count) {
        if(i == 20) {
            println("HEYYYYY 20")
            i++
            continue
        }
        println("Count $i")
        i++
    }
}