import java.util.*


fun main() {
    playGame()
}


fun playGame() {
    var player1Score = 0
    var player2Score = 0
    var currentPlayer = 1
    var isDone = false
    while(!isDone) {
        println("PLEASE ENTER TO ROLL... Current Player $currentPlayer \n")
        readln()
        if(currentPlayer == 1) {
            val points = rollDice()
            println("Player 1 rolls dice..... $points")
            player1Score+=points
            currentPlayer = 2
        }else{
            val points = rollDice()
            println("Player 2 : $points")
            player2Score+=points
            currentPlayer = 1
        }


        var result = checkScore(player1Score, player2Score)
        if(result) {
            isDone = true
        }

        showScore(player1Score,player2Score)

    }
}

fun rollDice() : Int {
    val number = Random().nextInt(5).inc()

    return number
}

fun showScore(player1Score : Int, player2Score: Int) {

    println("----------------------\nScore")
    println("Player 1 : $player1Score")
    println("Player 2 : $player2Score")
}

fun checkScore(player1 : Int, player2 : Int) : Boolean {
    if(player1 >= 20){
        println("Player 1 Wins")
        return true
    }else if(player2 >= 20) {
        println("Player 2 Wins")
        return true
    }else {
        return false
    }
}


