fun main() {
    var names : MutableList<User> = mutableListOf()

    for (i in 1..3) {
        var userInput = readln()
        names.add(User(userInput))
    }
    var filterNames = names.filter {
        it.name[0] == 'r'
    }


}

class User(var name : String)