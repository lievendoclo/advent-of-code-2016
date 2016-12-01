package be.insaneprogramming.adventofcode

import be.insaneprogramming.adventofcode.Direction.NORTH

class DayOne {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val position = Position(0, 0, NORTH)
            val moves = MoveParser().parseMoves(MoveParser::class.java.getResourceAsStream("moves.txt"))
            position.move(moves)
            val distance = position.currentDistanceFromOrigin()
            println("Shortest distance to start position: " + distance)
        }
    }
}