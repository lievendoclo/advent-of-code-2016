package be.insaneprogramming.adventofcode

enum class Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    fun turn(turn: Turn) = if(turn == Turn.LEFT) turnLeft() else turnRight()

    private fun turnLeft() : Direction {
        return when(this) {
            NORTH -> WEST
            WEST -> SOUTH
            SOUTH -> EAST
            EAST -> NORTH
        }
    }

    private fun turnRight() : Direction {
        return when(this) {
            NORTH -> EAST
            WEST -> NORTH
            SOUTH -> WEST
            EAST -> SOUTH
        }
    }
}