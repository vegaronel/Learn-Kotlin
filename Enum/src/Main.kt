fun main() {

   val distance = Direction.valueOf("east".uppercase())

    when(distance) {
        Direction.SOUTH -> distance.move("HOLA")
        Direction.NORTH -> distance.move("HELLO")
        Direction.WEST -> distance.move("ANNYEONG")
        Direction.EAST -> distance.move("MABUHAY")
    }

}

enum class Direction(private var direction : String, var distance : Int) {
    SOUTH("South", 23),
    NORTH("North", 25),
    EAST("East", 23),
    WEST("West", 36);

    fun move(greet : String) {
        println("We are moving towards $direction. $greet")
    }
}

