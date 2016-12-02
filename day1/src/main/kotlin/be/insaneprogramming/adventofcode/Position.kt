package be.insaneprogramming.adventofcode

import be.insaneprogramming.adventofcode.Direction.*

data class Position(var currentCoordinate: Coordinate, var direction: Direction, var history: MutableList<Coordinate> = mutableListOf(), var firstDoubleCoordinate: Coordinate = Coordinate(0, 0)) {
    fun move(move:Move) {
        turn(move.turn)
        for(i in 1..move.distance)
            walkAndKeepTrack()
    }

    fun turn(turn: Turn) {
        direction = direction.turn(turn)
    }

    fun walkAndKeepTrack(distance : Int = 1) {
        walk(distance)
        savePosition()
    }

    private fun savePosition() = history.add(currentCoordinate)

    private fun walk(distance: Int) {
        currentCoordinate = when (direction) {
            NORTH -> currentCoordinate.copy(y = currentCoordinate.y + distance)
            EAST -> currentCoordinate.copy(x = currentCoordinate.x + distance)
            SOUTH -> currentCoordinate.copy(y = currentCoordinate.y - distance)
            WEST -> currentCoordinate.copy(x = currentCoordinate.x - distance)
        }
    }
}