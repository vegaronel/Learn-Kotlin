fun main() {

    var daetLibrary = Library("Daet Library")
    daetLibrary.addBook("Simp man", "Wakky")

    var mantagbacLibrary = Library("Mantagbac Library")
    mantagbacLibrary.addBook("Water bender", "Shaolin")
    var isDone = false

    while (!isDone) {
        println("Press [1] to show libraries")
        var selectedLibrary = readln().toInt()

        when(selectedLibrary) {
            1 -> showLibraries(mantagbacLibrary, daetLibrary)
        }

     }


}

fun showLibraries(mantagbacLibrary : Library, daetLibrary: Library) {
    println("[1] Mantagbac\n[2] Daet ")
    when(readln().toInt()) {
        1 -> {
            mantagbacLibrary.showBooks()
            addNewBook(mantagbacLibrary)
        }
        2 -> {
            daetLibrary.showBooks()
            addNewBook(daetLibrary)
        }
    }
}



fun addNewBook(location : Library) {
    location.showBooks()
    println("To add book enter [1]")
    var toAddBook = readln().toInt()
    if(toAddBook == 1){
        println("Enter the title]")
        var title = readln()
        println("Enter the author]")
        var author = readln()
        location.addBook(title,author)
        println("\nSuccess adding $title\n")
    }

}

class Library(var name : String) {
    var books : MutableList<Book> = mutableListOf()

    inner class Book(var title : String, var author : String ) {
        fun getDetails() {
            println("Location : $name \nTitle -> Author\n$title - $author\n--------------------------\n")
        }
    }

    fun addBook(title : String, author: String) {
        var newBook = Book(title, author)
        books.add(newBook)
    }

    fun showBooks() {

        books.forEachIndexed { index, book ->

            book.getDetails()

        }
    }


}