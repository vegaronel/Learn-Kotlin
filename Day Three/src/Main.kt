import kotlin.random.Random

fun main() {
    var lives = 5
    var score = 0
    var questions = getQuestions()
    var isDone = false

    var randomQuestion = questions[Random.nextInt(questions.size)]
    while (!isDone) {
      if(score == 5) {
          println("CONGRATS YOU WIN")
          break
      }
        if(lives < 1) {
            println("YOU LOST")
            break
        }

        println(randomQuestion.question)
        var answer = readln()

        if(answer.lowercase() == randomQuestion.answer.lowercase()){

            score++
            println("You are correct.")
            println("Score: $score")
            randomQuestion = questions[Random.nextInt(questions.size-1)]
        }else{
            lives--
            println("Wrong.\nLives: $lives")

        }
    }




}
fun getQuestions() : List<Question> {
    return listOf(
        Question("What is my favorite drink?", "Coke"),
        Question("What is my favorite food?", "Adobo"),
        Question("What is my favorite game?", "Mobile Legends"),
        Question("What is my favorite color?", "Blue"),
        Question("What is my favorite sport?", "Basketball"),
        Question("What is my favorite movie?", "Avengers"),
        Question("What is my favorite anime?", "One Piece"),
        Question("What is my favorite subject?", "Math"),
        Question("What is my dream job?", "Software Engineer"),
        Question("What is my favorite programming language?", "Kotlin"),
        Question("What is my favorite fruit?", "Mango"),
        Question("What is my favorite place to travel?", "Japan"),
        Question("What is my favorite pet?", "Dog"),
        Question("What is my favorite ice cream flavor?", "Chocolate"),
        Question("What is my favorite song?", "Shape of You"),
        Question("What is my favorite cartoon?", "SpongeBob"),
        Question("What is my favorite holiday?", "Christmas"),
        Question("What is my favorite season?", "Summer"),
        Question("What is my favorite fast food?", "Jollibee"),
        Question("What is my favorite social media app?", "Facebook"),
        Question("What is my favorite hobby?", "Coding"),
        Question("What is my favorite TV show?", "Stranger Things"),
        Question("What is my favorite superhero?", "Iron Man")
    )
}

class Question(var question : String, var answer : String)

fun watchMovie() {
    var isDone = false
    while (!isDone) {
        try {
            println("[1] Show Movies, [2] Search Movie, [0] Exit")
            val answer = readln()

            when(answer){
                "1" -> showMovies()
                "2" -> searchMovie()
                "0" -> isDone = true
            }
        }catch (e : Exception) {
            println("Please type a valid input")
        }
    }
}

fun searchMovie() {
    println("Type in the movie you want to search")
    val searchInput = readln()
    val result = getMovies().filter { it.title.lowercase().contains(searchInput.lowercase()) }
    if(result.size != 0) {
        result.forEach {
            println("Title: ${it.title}\nRating: ${it.rating}\nDetails: ${it.description}")
        }
    }
}

fun showMovies() {
    getMovies().forEachIndexed { index, movie ->
        println("[$index] ${movie.title}")
    }
    var movieIndex : Int? = null
    try {
        println("Enter the number of the selected movie.")
        movieIndex = readln().toInt()
        val selectedMovie = getMovies()[movieIndex]
        println("Title: ${selectedMovie.title}\nRating: ${selectedMovie.rating}\nDetails: ${selectedMovie.description}")
    }catch (e : Exception) {
        println("Index $movieIndex is not exist.")
    }
}


class Movie(var title : String, var description : String, var rating : Int)



fun getMovies() : List<Movie> {
    return  listOf(
        Movie("The Lost Kingdom", "An epic tale of a forgotten empire.", 8),
        Movie("Shadows of Tomorrow", "A sci-fi thriller set in a dystopian future.", 7),
        Movie("Ocean Whisper", "A drama about love and sacrifice at sea.", 6),
        Movie("Crimson Blade", "An action-packed samurai adventure.", 9),
        Movie("Silent Echo", "A suspenseful story of hidden secrets.", 8),
        Movie("Digital Dreams", "Exploring the blurred line between AI and humanity.", 7),
        Movie("Golden Hour", "A romantic film set during magical sunsets.", 6),
        Movie("Iron Fortress", "Warriors defend their stronghold against invaders.", 9),
        Movie("Neon Streets", "A crime drama in a cyberpunk city.", 8),
        Movie("Frozen Path", "A survival story in the Arctic wilderness.", 7),
        Movie("Desert Storm", "Soldiers caught in an unexpected battle.", 8),
        Movie("Midnight Train", "A mystery unfolds during a night journey.", 7),
        Movie("Rising Dawn", "A hopeful story of resilience and courage.", 6),
        Movie("Blood and Honor", "Gladiators fight for survival in the arena.", 9),
        Movie("Echo Valley", "A small town mystery with dark secrets.", 7),
        Movie("Dream Chasers", "Young athletes striving for greatness.", 8),
        Movie("Galaxy Wars", "A space opera of intergalactic conflict.", 9),
        Movie("Haunted Memories", "A psychological horror about a cursed mansion.", 6),
        Movie("Steel Heart", "A soldier torn between love and duty.", 8),
        Movie("Infinite Loop", "A time-travel paradox thriller.", 9),
        Movie("Fallen Angel", "A drama of redemption and forgiveness.", 7),
        Movie("Wild Horizon", "Adventurers exploring uncharted lands.", 8),
        Movie("Broken Strings", "A musician struggling with loss and fame.", 6),
        Movie("Final Gambit", "A high-stakes casino heist.", 8),
        Movie("Lunar Eclipse", "Explorers uncover secrets on the moon.", 7),
        Movie("Silent River", "A haunting mystery by the riverbank.", 6),
        Movie("Cyber Vengeance", "A hacker fights against a corrupt system.", 9),
        Movie("Stormbreaker", "Heroes battle a supernatural storm.", 8),
        Movie("Emerald Sky", "An emotional drama of long-distance love.", 7),
        Movie("Zero Hour", "A ticking-clock action thriller.", 9)
    )
}
