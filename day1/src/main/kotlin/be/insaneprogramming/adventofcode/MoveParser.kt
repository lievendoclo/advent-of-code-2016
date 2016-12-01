package be.insaneprogramming.adventofcode

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader

class MoveParser {
    fun parseMoves(input: InputStream) : List<Move> {
        val line = readSingleLineFromInputStream(input)
        return convertMoveInstructionsToList(line)
    }

    private fun readSingleLineFromInputStream(input: InputStream): String {
        val streamReader = BufferedReader(InputStreamReader(input))
        return streamReader.readLine()
    }

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
