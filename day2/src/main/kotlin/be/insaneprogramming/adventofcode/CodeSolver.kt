package be.insaneprogramming.adventofcode

class CodeSolver(val keypad: Keypad) {
    fun startAt(coordinate: Coordinate) {
        keypad.currentCoordinate = coordinate
    }

    fun getCode(input:String) : String {
        val moves = MoveParser().convertLinesToMoves(input.split("\n"))
        return moves.map {
            it.forEach { it.direction.apply(keypad) }
            keypad.getCurrentKey()
        }.reduce(String::plus)
    }
}