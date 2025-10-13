fun main() {
    val dog = Dog("ekko")
    dog.eat()
    dog.makeSound()
    dog.hobby()

    val cat1 = Cat("kokoy")
    cat1.eat()
    cat1.makeSound()
    cat1.hobby()
}


abstract class Animals(val name : String) {
    fun eat() {
        println("$name is eating")
    }
    abstract fun hobby()
}

class Dog(name: String) : Animals(name) {
    fun makeSound() {
        println("aw aw aw")
    }

    override fun hobby() {
        println("mang kagat")
    }
}

class Cat(name : String) : Animals(name) {
    fun makeSound() {
        println("meow meow meow")
    }
    override fun hobby() {
        println("mang karmos")
    }
}

