fun main() {

    moveDirection(Direction.South)

}

fun moveDirection(direction: Direction) {
    when(direction) {
        Direction.South -> println("Moving to ${Direction.South}")
        Direction.North -> println("Moving to ${Direction.North}")
        Direction.West -> println("Moving to ${Direction.West}")
        Direction.East -> println("Moving to ${Direction.East}")
    }
}

enum class Direction() {
    North,
    South,
    West,
    East
}