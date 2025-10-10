fun main() {
    while (true) {
        startAddingBook()
    }
}

fun startAddingBook(){
    val manila = Library("Manila")
    val daet = Library("Daet")

    println("Select library location. [1] Manila [2] Daet")
    val select = readln().toInt()
    when(select) {
        1 ->  optionSelectAdd(select, manila, daet)
        2 ->  optionSelectAdd(select, manila, daet)
    }

    showBooks(manila, daet)
}
fun showBooks(manila : Library, daet : Library) {
    println("To list all the books press [1] Manila [2] Daet")
    val select = readln().toInt()
    optionSelectAdd(select, manila, daet)
}

fun optionSelectAdd(select : Int, manila : Library, daet: Library) {
    if(select == 1) {
        println("[1] to add new book [2] to show all books")
        when(readln().toInt()) {
            1 -> manila.addBook()
            else -> manila.showBooks()
        }
    }else {
        println("[1] to add new book [2] to show all books")
        when(readln().toInt()) {
            1 -> manila.addBook()
            else -> manila.showBooks()
        }
    }

}

class Library(val location : String) {
    val books = mutableListOf<Book>()

    inner class Book(val title : String, val author : String) {
        fun info() {
            println("Title: $title -> Author: $author")
        }
    }

    fun addBook() {

        print("Enter title: ")
        val title = readln()
        print("Enter author")
        val author = readln()
        books.add(Book(title, author))
    }

    fun showBooks() {
        if(books.isEmpty()) println("Empty")
        books.forEachIndexed { index, book ->
            println("[$index] -> ${book.author} - ${book.title}")
        }
    }

}