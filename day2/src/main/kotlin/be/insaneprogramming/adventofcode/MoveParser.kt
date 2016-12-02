package be.insaneprogramming.adventofcode

class MoveParser {
    fun convertMoveInstructionsToList(line: String): List<Move> {
        return getIndividualMoveInstructions(line).map {
            val direction = getDirectionFromMoveString(it)
            Move(direction)
        }
    }

    private fun getIndividualMoveInstructions(line: String) = line.split("").filter { it.isNotBlank() }

    private fun getDirectionFromMoveString(directionInstruction: String): Direction {
        return when(directionInstruction) {
            "U" -> Direction.UP
            "D" -> Direction.DOWN
            "L" -> Direction.LEFT
            "R" -> Direction.RIGHT
            else -> throw IllegalArgumentException()
        }
    }
}
