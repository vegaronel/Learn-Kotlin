
data class Books(val title : String, val author : String)

fun main() {
    var books = mutableListOf(
        Books("Ronel", "RONEL")
    )

    fun saveBook() {
        val result = addNewBook("Land of Mambalite", "Ronel");
        books.add(result)
        for(book in books) {
            println("Title: ${book.title}\nAuthor: ${book.author}\n----------")
        }
    }

    saveBook();
}

fun addNewBook(title : String, author : String = setAuthor()) : Books {
    return Books(title, author)
}

fun setAuthor() = "Unknown"
