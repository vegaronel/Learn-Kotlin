fun main() {
    println(addAll(123,23,14,124,5,2,1,212,4,))
}

fun addAll(vararg numbers : Int) {
   numbers.forEach {
       println(it)
   }
}