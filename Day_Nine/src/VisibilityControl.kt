fun main() {

    var name: String? = "asdasd"
    println(name?.length ?: 0)


//    val ekko = Dog()
//    println(ekko.introduce())
//    println("${ekko.name} ${ekko.age}")
//
//    val nero = Cat()
//
//    println(nero.introduce())
}

interface Animal {
    val name : String
    val age : Int
    fun run() : String

    fun introduce() = "Hello $name, you are so cute"
}

class Dog() : Animal {
    override val name : String  = "Ekko"
    override val age : Int = 3
    override fun run() = "meowww, hrkasjd, mewws,da"

}

class Cat() : Animal {
    override val name : String = "Nero"
    override val age : Int = 1
    override fun run() = "bark.asjdka babark barkanasbaklaab "
}