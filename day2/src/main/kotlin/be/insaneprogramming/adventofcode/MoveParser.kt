package be.insaneprogramming.adventofcode

class MoveParser {
    fun convertMoveInstructionsToList(line: String): List<Move> = getIndividualMoveInstructions(line).map { Move(getDirectionFromMoveString(it)) }

    private fun getIndividualMoveInstructions(line: String) = line.split("").filter { it.isNotBlank() }

    private fun getDirectionFromMoveString(directionInstruction: String): Direction = when(directionInstruction) {
            "U" -> Direction.UP
            "D" -> Direction.DOWN
            "L" -> Direction.LEFT
            "R" -> Direction.RIGHT
            else -> throw IllegalArgumentException()
        }
}
