//
//
//fun main() {
//
//    print("Enter your money")
//    val money = readln().toDouble()
//    val cash = CashMethod(money)
//    val card = CardMethod(money)
//
//
//    card.processPayment()
//    card.printReceipt()
//
//}
//
//
//interface Process {
//    fun processPayment()
//}
//
//abstract class Payment() : Process {
//    fun printReceipt() {
//        println("Receipt is being print")
//    }
//
//}
//
//class CashMethod(val cash : Double) : Payment() {
//    override fun processPayment() {
//        println("Your paid cash. Success Payment.")
//    }
//}
//
//class CardMethod(val cash : Double) : Payment() {
//    override fun processPayment() {
//        println("Card Payment method is being process")
//        Thread.sleep(1000)
//        println("Sucess")
//    }
//}
//
//
//data class Student (val name : String, val id : Int)