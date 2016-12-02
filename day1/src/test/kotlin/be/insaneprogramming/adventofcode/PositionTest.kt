package be.insaneprogramming.adventofcode

import be.insaneprogramming.adventofcode.Direction.*
import be.insaneprogramming.adventofcode.Turn.LEFT
import be.insaneprogramming.adventofcode.Turn.RIGHT
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PositionTest {
    @Test
    fun testTurnLeft() {
        val position = Position(Coordinate(0, 0), NORTH)
        position.turn(LEFT)
        assertThat(position.direction).isEqualTo(WEST)
        position.turn(LEFT)
        assertThat(position.direction).isEqualTo(SOUTH)
        position.turn(LEFT)
        assertThat(position.direction).isEqualTo(EAST)
        position.turn(LEFT)
        assertThat(position.direction).isEqualTo(NORTH)
    }

    @Test
    fun testTurnRight() {
        val position = Position(Coordinate(0, 0), NORTH)
        position.turn(RIGHT)
        assertThat(position.direction).isEqualTo(EAST)
        position.turn(RIGHT)
        assertThat(position.direction).isEqualTo(SOUTH)
        position.turn(RIGHT)
        assertThat(position.direction).isEqualTo(WEST)
        position.turn(RIGHT)
        assertThat(position.direction).isEqualTo(NORTH)
    }

    @Test
    fun testWalkNorth() {
        val position = Position(Coordinate(0, 0), NORTH)
        position.walkInCurrentDirection(10)
        assertThat(position).isEqualTo(Position(Coordinate(0, 10), NORTH))
    }

    @Test
    fun testWalkSouth() {
        val position = Position(Coordinate(0, 0), SOUTH)
        position.walkInCurrentDirection(10)
        assertThat(position).isEqualTo(Position(Coordinate(0, -10), SOUTH))
    }

    @Test
    fun testWalkEast() {
        val position = Position(Coordinate(0, 0), EAST)
        position.walkInCurrentDirection(10)
        assertThat(position).isEqualTo(Position(Coordinate(10, 0), EAST))
    }

    @Test
    fun testWalkWest() {
        val position = Position(Coordinate(0, 0), WEST)
        position.walkInCurrentDirection(10)
        assertThat(position).isEqualTo(Position(Coordinate(-10, 0), WEST))
    }
}