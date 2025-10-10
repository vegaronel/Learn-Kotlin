fun main() {
    val ronel = PartTimeEmployee("Ronel", 53, 120)

    ronel.calculateSalary()
    ronel.giveSalary()

    val wakin = FullTimeEmployee("Wakin",2020.0)
    wakin.calculateSalary()
    wakin.giveSalary()


}


abstract class Employees(val name : String) {
    abstract fun calculateSalary() : Double
    fun giveSalary() {
        println("$name your salary is ready to be received.\n")
    }
}

class FullTimeEmployee(name : String, val fixedSalary : Double) : Employees(name) {

    override fun calculateSalary(): Double {
        println("You are a Full Time Employee $name! Your salary is fixed by $fixedSalary")
        return fixedSalary
    }

}
class PartTimeEmployee(name : String, val hours : Int, val rate : Int) : Employees(name) {
    override fun calculateSalary(): Double {
        val salary = (hours * rate).toDouble()
        println("Salary Computation is $salary")
        return salary
    }
}



fun createPayment() {
    var cash = CashPayment()

    try {
        println("Please enter your cash money to proceed")
        val money = readln().toDouble()
        cash.processPayment(money)
        cash.printReceipt(money)
    }catch(e : Exception) {
        println("Invalid number")
    }

}

// Abstract for Payments
abstract class Payment() {
    abstract fun processPayment(amount : Double)

    fun printReceipt(amount : Double) {
        println("Payment of $amount is being printed")
        for(i in 1..100) {
            print(" $i")
            Thread.sleep(10)
        }
        println("\nSuccess")
    }

}

class CreditCardPayment() : Payment() {
    override fun processPayment(amount: Double) {
        println("Your credit card payment with the amount of $amount is success.")
    }
}
class CashPayment() : Payment() {
    override fun processPayment(amount: Double) {
        println("Your cash payment with the amount of $amount is success.")
    }
}


// Abstract for Vehicle
abstract class Vehicle() {
    abstract fun drive()

    open fun fuelUp() {
        println("Fueling the tank...")
    }
}

class Car(val brand : String) : Vehicle() {
    override fun drive() {
        println("$brand is not moving to target destination.")
    }
}