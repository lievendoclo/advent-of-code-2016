package be.insaneprogramming.adventofcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class MoveParserTest {
    @Test
    fun shouldParseMoveInstructions() {
        val parser = MoveParser()
        val moveInstruction = "UUDLR"
        val moves = parser.convertLinesToMoves(listOf(moveInstruction))
        assertThat(moves).hasSize(5)
        assertThat(moves).containsExactlyInAnyOrder(listOf(Move(Direction.UP), Move(Direction.UP), Move(Direction.DOWN), Move(Direction.LEFT), Move(Direction.RIGHT)))
    }
}