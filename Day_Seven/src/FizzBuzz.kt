
fun main() {
   val wakky = Player("Wakky", 74, "ML daw")
    wakky.greet()

    var animals = listOf("Dog", "cat", "bird")



}


open class Person(val name : String, val age : Int) {
    open fun greet() {
        println("$name is $age years old")
    }
}

class Player(name : String, age : Int, val sport : String) : Person(name, age) {
    override fun greet() {
        println("$name is $age years old and his favorite sport is $sport")
    }

}