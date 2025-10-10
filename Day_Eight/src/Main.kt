//fun main() {
//    var playerOne = Player("Ronel", 24, "Invisible")
//    playerOne.displayFriendName()
//}
//
//
//open class Person(var name : String, var age : Int) {
//    open val friend : String
//
//    init {
//        friend = "None"
//        println("Person is created")
//    }
//    open fun displayFriendName() {
//        println("This is my friend ${this.friend}")
//    }
//    open fun greet() {
//        println("Hi $name, nice to meet you")
//    }
//
//
//}
//
//class Player(name : String, age : Int, val power : String) : Person(name, age) {
//    init {
//        println("Player is created")
//    }
//    override fun greet() {
//        println("Hi $name, nice to meet you, your power is $power?")
//    }
//
//    override fun displayFriendName() {
//        super.displayFriendName()
//        println("I am here at Player Class, ${super.friend}")
//    }
//
//}