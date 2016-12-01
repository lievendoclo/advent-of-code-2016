package be.insaneprogramming.adventofcode

import be.insaneprogramming.adventofcode.Direction.*

data class Position(var currentCoordinate: Coordinate, var direction: Direction) {
    fun move(move:Move) {
        turn(move.turn)
        walkInCurrentDirection(move.distance)
    }

    fun turn(turn: Turn) {
        direction = direction.turn(turn)
    }

    fun walkInCurrentDirection(distance: Int) {
        currentCoordinate = when(direction) {
            NORTH -> currentCoordinate.copy(y = currentCoordinate.y + distance)
            EAST -> currentCoordinate.copy(x = currentCoordinate.x + distance)
            SOUTH -> currentCoordinate.copy(y = currentCoordinate.y - distance)
            WEST -> currentCoordinate.copy(x = currentCoordinate.x - distance)
        }
    }
}