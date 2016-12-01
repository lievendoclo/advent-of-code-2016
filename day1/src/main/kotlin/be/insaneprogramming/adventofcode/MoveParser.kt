package be.insaneprogramming.adventofcode

class MoveParser {
    fun convertMoveInstructionsToList(line: String): List<Move> {
        return getIndividualMoveInstructions(line).map {
            val turn = getTurnFromMoveString(it)
            val distance = getDistanceFromMoveString(it)
            Move(turn, distance)
        }
    }

    private fun getIndividualMoveInstructions(line: String) = line.split(", ")

    private fun getDistanceFromMoveString(moveInstruction: String): Int = Integer.parseInt(getDistanceStringFromMoveInstruction(moveInstruction))

    private fun getDistanceStringFromMoveInstruction(moveInstruction: String) = moveInstruction.substring(1, moveInstruction.length)

    private fun getTurnFromMoveString(moveInstruction: String): Turn {
        return when(getTurnInstructionStringFromMoveInstruction(moveInstruction)) {
            "R" -> Turn.RIGHT
            "L" -> Turn.LEFT
            else -> throw IllegalArgumentException()
        }
    }

    private fun getTurnInstructionStringFromMoveInstruction(moveInstruction: String) = moveInstruction.substring(0, 1)
}
