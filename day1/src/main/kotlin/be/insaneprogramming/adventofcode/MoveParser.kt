package be.insaneprogramming.adventofcode

class MoveParser {
    fun convertMoveInstructionsToList(line: String): List<Move> = splitInstructions(line).map {
            val turn = extractTurnFromInstruction(it)
            val distance = extractDistanceFromInstruction(it)
            Move(turn, distance)
        }

    private fun splitInstructions(instructions: String) = instructions.split(", ")

    private fun extractDistanceFromInstruction(moveInstruction: String) = Integer.parseInt(moveInstruction.substring(1, moveInstruction.length))

    private fun extractTurnFromInstruction(moveInstruction: String): Turn = when(moveInstruction.substring(0, 1)) {
            "R" -> Turn.RIGHT
            "L" -> Turn.LEFT
            else -> throw IllegalArgumentException()
        }

}
