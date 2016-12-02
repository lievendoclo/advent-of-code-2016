package be.insaneprogramming.adventofcode

import be.insaneprogramming.adventofcode.Direction.*

data class Position(var currentCoordinate: Coordinate, var direction: Direction, var history: MutableList<Coordinate> = mutableListOf(), var firstDoubleCoordinate: Coordinate = Coordinate(0, 0)) {
    fun move(move:Move) {
        turn(move.turn)
        for(i in 1..move.distance)
            walkOneBlockAndKeepTrack()
    }

    fun turn(turn: Turn) {
        direction = direction.turn(turn)
    }

    fun walkOneBlockAndKeepTrack() {
        walkOneBlock()
        savePosition()
    }

    private fun savePosition() = history.add(currentCoordinate)

    private fun walkOneBlock() {
        currentCoordinate = when (direction) {
            NORTH -> currentCoordinate.copy(y = currentCoordinate.y + 1)
            EAST -> currentCoordinate.copy(x = currentCoordinate.x + 1)
            SOUTH -> currentCoordinate.copy(y = currentCoordinate.y - 1)
            WEST -> currentCoordinate.copy(x = currentCoordinate.x - 1)
        }
    }
}