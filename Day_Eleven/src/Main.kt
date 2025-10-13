fun main() {
    println(readln().countConsonants())
    println(Guitar.getStrings(readln().toInt()))
}

fun String.countConsonants() : Int {
    var count = 0
    for(letter in this) {
        if(letter.lowercaseChar() in "bcdfghjklmnpqrstvwxyz") {
            count++
        }

    }
    return count
}

class Guitar {
    companion object {
        fun getStrings(strings : Int) : String {
            return "$strings strings created"
        }
    }
}


