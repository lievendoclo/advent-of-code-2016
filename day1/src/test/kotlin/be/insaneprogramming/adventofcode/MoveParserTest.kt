package be.insaneprogramming.adventofcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class MoveParserTest {
    @Test
    fun shouldParseMoveInstructions() {
        val parser = MoveParser()
        val moveInstruction = "R5, L53, R5, R333"
        val moves = parser.convertMoveInstructionsToList(moveInstruction)
        assertThat(moves).hasSize(4)
        assertThat(moves).containsExactlyInAnyOrder(Move(Turn.RIGHT, 5), Move(Turn.LEFT, 53), Move(Turn.RIGHT, 5), Move(Turn.RIGHT, 333))
    }
}