package be.insaneprogramming.adventofcode

import be.insaneprogramming.adventofcode.Direction.*
import be.insaneprogramming.adventofcode.Turn.LEFT
import be.insaneprogramming.adventofcode.Turn.RIGHT
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PositionTest {
    @Test
    fun testTurnLeft() {
        val position = Position(0, 0, NORTH)
        position.changeDirection(LEFT)
        assertThat(position.direction).isEqualTo(WEST)
        position.changeDirection(LEFT)
        assertThat(position.direction).isEqualTo(SOUTH)
        position.changeDirection(LEFT)
        assertThat(position.direction).isEqualTo(EAST)
        position.changeDirection(LEFT)
        assertThat(position.direction).isEqualTo(NORTH)
    }

    @Test
    fun testTurnRight() {
        val position = Position(0, 0, NORTH)
        position.changeDirection(RIGHT)
        assertThat(position.direction).isEqualTo(EAST)
        position.changeDirection(RIGHT)
        assertThat(position.direction).isEqualTo(SOUTH)
        position.changeDirection(RIGHT)
        assertThat(position.direction).isEqualTo(WEST)
        position.changeDirection(RIGHT)
        assertThat(position.direction).isEqualTo(NORTH)
    }

    @Test
    fun testWalkNorth() {
        val position = Position(0, 0, NORTH)
        position.walk(10)
        assertThat(position).isEqualTo(Position(0, 10, NORTH))
    }

    @Test
    fun testWalkSouth() {
        val position = Position(0, 0, SOUTH)
        position.walk(10)
        assertThat(position).isEqualTo(Position(0, -10, SOUTH))
    }

    @Test
    fun testWalkEast() {
        val position = Position(0, 0, EAST)
        position.walk(10)
        assertThat(position).isEqualTo(Position(10, 0, EAST))
    }

    @Test
    fun testWalkWest() {
        val position = Position(0, 0, WEST)
        position.walk(10)
        assertThat(position).isEqualTo(Position(-10, 0, WEST))
    }

    @Test
    fun testMoves() {
        assertDistanceFromOriginAfterMoves("R2, L3", 5)
        assertDistanceFromOriginAfterMoves("R2, R2, R2", 2)
        assertDistanceFromOriginAfterMoves("R5, L5, R5, R3", 12)
    }

    private fun assertDistanceFromOriginAfterMoves(moveString: String, expectedLength: Int) {
        val position = Position(0, 0, NORTH)
        val moves = getMoves(moveString)
        position.move(moves)
        assertThat(position.currentDistanceFromOrigin()).isEqualTo(expectedLength)
    }

    private fun getMoves(moveString: String) = MoveParser().convertMoveInstructionsToList(moveString)
}