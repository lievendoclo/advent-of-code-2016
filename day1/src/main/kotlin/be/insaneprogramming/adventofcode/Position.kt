package be.insaneprogramming.adventofcode

import be.insaneprogramming.adventofcode.Direction.*

data class Position(var x: Int, var y: Int, var direction: Direction) {
    fun move(moves:List<Move>) {
        moves.forEach { move(it) }
    }

    fun move(move:Move) {
        changeDirection(move.turn)
        walk(move.distance)
    }

    fun changeDirection(turn: Turn) {
        direction = direction.turn(turn)
    }

    fun walk(distance: Int) {
        when(direction) {
            NORTH -> y += distance
            EAST -> x+= distance
            SOUTH -> y -= distance
            WEST -> x -= distance
        }
    }

    fun currentDistanceFromOrigin() : Int = Math.abs(x) + Math.abs(y)
}