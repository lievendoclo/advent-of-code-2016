package be.insaneprogramming.adventofcode

class Traveler(val position: Position) {
    fun travel(moveInstructions: String) = MoveParser().convertMoveInstructionsToList(moveInstructions).forEach { position.move(it) }

    fun getCrossings() : List<Coordinate> = position.history.groupBy { it }.entries.filter { it.value.size > 1 }.map { it.key }
}