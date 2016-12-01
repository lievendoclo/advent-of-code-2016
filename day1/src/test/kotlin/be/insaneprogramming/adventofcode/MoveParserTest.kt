package be.insaneprogramming.adventofcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class MoveParserTest {
    @Test
    fun shouldParseMoveFile() {
        val parser = MoveParser()
        val moves = parser.parseMoves(MoveParser::class.java.getResourceAsStream("moves.txt"))
        assertThat(moves).hasSize(149)
    }
}