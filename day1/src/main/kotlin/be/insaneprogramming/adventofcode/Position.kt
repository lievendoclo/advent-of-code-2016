package be.insaneprogramming.adventofcode

import be.insaneprogramming.adventofcode.Direction.*

data class Position(var currentCoordinate: Coordinate, var direction: Direction, var history: MutableList<Coordinate> = mutableListOf(), var firstDoubleCoordinate: Coordinate = Coordinate(0, 0)) {
    fun move(move:Move) {
        turn(move.turn)
        for(i in 1..move.distance)
            walkInCurrentDirection()
    }

    fun turn(turn: Turn) {
        direction = direction.turn(turn)
    }

    fun walkInCurrentDirection(distance : Int = 1) {
        currentCoordinate = when(direction) {
            NORTH -> currentCoordinate.copy(y = currentCoordinate.y + distance)
            EAST -> currentCoordinate.copy(x = currentCoordinate.x + distance)
            SOUTH -> currentCoordinate.copy(y = currentCoordinate.y - distance)
            WEST -> currentCoordinate.copy(x = currentCoordinate.x - distance)
        }
        if(history.contains(currentCoordinate) && firstDoubleCoordinate == Coordinate(0, 0)) {
            firstDoubleCoordinate = currentCoordinate
        }
        history.add(currentCoordinate)
    }

    fun firstDoubleVisitedCoordinate() : Coordinate {
        return history.groupBy { it }.entries.find { it.value.size > 1 }!!.key
    }
}