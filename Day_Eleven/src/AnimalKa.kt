fun main() {
    val dog = Aso("Ekko", 21)
    val cat = Ikos("Mingaw", 24)

    while (true) {
        print("Choose Pet\n[1] Dog \n[2] Cat")
        val choosen = readln().toInt()
        when(choosen) {
            1 -> listMovement(dog)
            2 -> listMovement(cat)
        }

    }
}


fun listMovement(pet: Animal) {
    println("[1] Tickle ${pet.name} sound\n[2] Feed ${pet.name}")
    when(readln().toInt()) {
        1 -> pet.makeSound()
        2 -> pet.eat()
    }
}




open class Animal(val name : String) {
    open fun makeSound() {
        println("$name is making a sound")
    }
    fun eat() {
        println("$name is eating...")
    }

}

class Aso(name : String, val age : Int) : Animal(name) {
    override fun makeSound() {
        println("AW AW AW NG ")
    }
}
class Ikos(name : String, val age : Int) : Animal(name) {
    override fun makeSound() {
        println("MEOW MEOW MEOW")
    }
}
