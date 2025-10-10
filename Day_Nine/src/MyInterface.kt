fun main() {
    val joaquin = Genz()

    joaquin.greet()
    joaquin.eatFoods()


}


interface MyPayment {
    fun paymentProcess()
}

abstract class Birthday () {
    abstract fun eatFoods()
    fun greet() {
        println("Happy birthday to  mo")
    }
}

class Genz() : Birthday() {
    override fun eatFoods() {
        println("I am eating spaghetti and pizza")
    }
}
class Millenials() : Birthday() {
    override fun eatFoods() {
        println("I am eating pansit and suman")
    }
}