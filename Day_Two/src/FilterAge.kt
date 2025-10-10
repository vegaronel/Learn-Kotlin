fun main() {
        var list : List<Person> = listOf(
            Person("Ronel", 24),
            Person("Biboy", 22),
            Person("Joaquin", 16)
        )

        var listOfLegalAge = filterAge(list)
        for(person in listOfLegalAge){
            println(person.name)
        }

}

fun filterAge(list : List<Person>) : List<Person> {
    return list.filter{
        it.age > 20
    }
}

class Person(var name : String, var age : Int)

