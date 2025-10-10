fun main() {
    val ekko = Dog("Ekko", "angry")

    ekko.introduce()
    ekko.makeSound()
}

abstract class Animal(val name : String) {
    abstract fun makeSound() // 

    open fun introduce() {
        println("Hello, $name")
    }

}

class Dog(name : String, val behaviour : String) : Animal(name){
    override fun makeSound() {
        println("woof woof woof")
    }

    override fun introduce() {
        println("hello,$name is $behaviour")
    }

}