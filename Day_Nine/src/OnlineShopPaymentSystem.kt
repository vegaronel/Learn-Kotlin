fun main() {

    val card = CardPayment(2000.0)

    card.processPayment()
    card.printReceipt()
    card.refund(2000.0)

}

interface Refundable {
    fun refund(amount : Double)
}

abstract class Payment(val amount : Double) : Refundable {
    abstract fun processPayment()
    fun printReceipt() {
        println("Receipt is being printed ")
        for(i in 1..10) {
            Thread.sleep(200)
            print(".")
        }
        println("\nTotal amount is $amount")
    }

}

class Gcash(amount : Double) : Payment(amount) {
    override fun processPayment() {
        println("Payment is being process through GCash")
    }
    override fun refund(amount: Double) {
        println("Refunding amount of $amount. Please check your GCash ")
    }
}

class CashPayment(amount : Double) : Payment(amount) {
    override fun processPayment() {
        println("Payment is being process through Cash")
    }
    override fun refund(amount: Double) {
        println("Refunding amount of $amount through cash. ")
    }
}

class CardPayment(amount : Double) : Payment(amount) {
    override fun processPayment() {
        println("Payment is being process through Card")
    }
    override fun refund(amount: Double) {
        var message = "Refunding amount of $amount. Please check your bank app"
        for(i in message) {
            print(i)
            Thread.sleep(100)
        }
    }
}
