//
//fun main() {
//
//    startBuy()
//
//}
//
//fun startBuy() {
//    val price : Double = 294.0
//
//    while (true) {
//        println("Please select [1]cash or card for [2]payment method.")
//        when(readln().toInt()) {
//            1 -> payItem(price, true)
//            2 -> payItem(price, false)
//        }
//    }
//}
//
//
//fun payItem(price : Double, isCash : Boolean) {
//    println("The price of the item is $price. \nEnter money")
//    val userMoney = readln().toDouble()
//
//    if(isCash) {
//        val newCashPayment = CashPayment(userMoney, price)
//        pay(newCashPayment)
//    }else {
//        val newCardPayment = CardPayment(userMoney, price)
//        pay(newCardPayment)
//    }
//    println("\n")
//
//}
//fun pay(selectedPayment: Payment) {
//    selectedPayment.calculatePayment()
//    selectedPayment.printReceipt()
//}
//
//interface Payable {
//    fun processPayment(amount : Double)
//}
//
//abstract class Refund() : Payable{
//    override fun processPayment(amount: Double) {
//        println("Payment for the amount $amount is processing")
//    }
//}
//
//abstract class Payment() : Payable {
//    abstract fun calculatePayment()
//    fun printReceipt() {
//        println("Receipt is being print")
//    }
//}
//
//class CashPayment(val cash : Double, val price : Double) : Payment() {
//    override fun processPayment(amount: Double) {
//        println("Payment is being process for the amount $amount")
//    }
//    override fun calculatePayment() {
//        println("You choose cash payment method.")
//        println("Total Price : $price\nChange: ${cash - price}")
//    }
//
//}
//
//class CardPayment(val card : Double, val price : Double) : Payment() {
//    override fun processPayment(amount: Double) {
//        println("Payment is being process for the amount $amount")
//    }
//    override fun calculatePayment() {
//        println("You choose card payment method.")
//        println("Total Price : $price\nChange: ${card - price}")
//    }
//
//}