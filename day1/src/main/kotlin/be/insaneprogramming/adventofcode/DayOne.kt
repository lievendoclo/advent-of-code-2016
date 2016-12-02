package be.insaneprogramming.adventofcode

import be.insaneprogramming.adventofcode.Direction.NORTH

class DayOne {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val startCoordinate = Coordinate(0, 0)
            val position = Position(startCoordinate, NORTH)
            getMoves().forEach { position.move(it) }
            println("Shortest distance to origin: " + position.currentCoordinate.rectilinearDistanceFrom(startCoordinate))
            println("Shortest distance from origin to coordinate visited twice first: " + position.firstDoubleCoordinate.rectilinearDistanceFrom(startCoordinate))

        }

        private fun getMoves(): List<Move> {
            val moveInstructionLine = "R5, L2, L1, R1, R3, R3, L3, R3, R4, L2, R4, L4, R4, R3, L2, L1, L1, R2, R4, R4, L4, R3, L2, R1, L4, R1, R3, L5, L4, L5, R3, L3, L1, L1, R4, R2, R2, L1, L4, R191, R5, L2, R46, R3, L1, R74, L2, R2, R187, R3, R4, R1, L4, L4, L2, R4, L5, R4, R3, L2, L1, R3, R3, R3, R1, R1, L4, R4, R1, R5, R2, R1, R3, L4, L2, L2, R1, L3, R1, R3, L5, L3, R5, R3, R4, L1, R3, R2, R1, R2, L4, L1, L1, R3, L3, R4, L2, L4, L5, L5, L4, R2, R5, L4, R4, L2, R3, L4, L3, L5, R5, L4, L2, R3, R5, R5, L1, L4, R3, L1, R2, L5, L1, R4, L1, R5, R1, L4, L4, L4, R4, R3, L5, R1, L3, R4, R3, L2, L1, R1, R2, R2, R2, L1, L1, L2, L5, L3, L1"
            val moves = MoveParser().convertMoveInstructionsToList(moveInstructionLine)
            return moves
        }
    }
}