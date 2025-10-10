fun main() {
    val ages = listOf(1,2,3,4,5, 23,2,899,34,122,343)

    var result = ages.reduce{accumulator, element ->
        if(accumulator > element) accumulator else element
    }
    println(result)

}