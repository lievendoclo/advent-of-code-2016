package be.insaneprogramming.adventofcode

import be.insaneprogramming.adventofcode.Direction.NORTH

class DayOne {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val startCoordinate = Coordinate(0, 0)
            val position = Position(startCoordinate, NORTH)
            getMovesFromFile().forEach { position.move(it) }
            println("Shortest distance to origin: " + position.currentCoordinate.rectilinearDistanceFrom(startCoordinate))
            println("Shortest distance from origin to coordinate visited twice first: " + position.firstDoubleCoordinate.rectilinearDistanceFrom(startCoordinate))

        }

        private fun getMovesFromFile(): List<Move> {
            val moveInstructionLine = InputStreamLineReader(MoveParser::class.java.getResourceAsStream("moves.txt")).readFirstLine()
            val moves = MoveParser().convertMoveInstructionsToList(moveInstructionLine)
            return moves
        }
    }
}