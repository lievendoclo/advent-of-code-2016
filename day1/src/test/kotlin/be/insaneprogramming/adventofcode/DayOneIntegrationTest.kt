package be.insaneprogramming.adventofcode

import io.damo.aspen.Test
import org.assertj.core.api.Assertions.assertThat

class DayOneIntegrationTest : Test({
    val start = Coordinate(0, 0)

    describe("When I move R2, L3") {
        val position = Position(start, Direction.NORTH)
        val moves = MoveParser().convertMoveInstructionsToList("R2, L3")
        moves.forEach {position.move(it)}

        test("I expect to be 5 blocks away") {
            assertThat(position.currentCoordinate.rectilinearDistanceFrom(start)).isEqualTo(5)

        }
    }

    describe("When I move R2, R2, R2") {
        val position = Position(start, Direction.NORTH)
        val moves = MoveParser().convertMoveInstructionsToList("R2, R2, R2")
        moves.forEach {position.move(it)}

        test("I expect to be 2 blocks away") {
            assertThat(position.currentCoordinate.rectilinearDistanceFrom(start)).isEqualTo(2)

        }
    }

    describe("When I move R2, R2, R2") {
        val position = Position(start, Direction.NORTH)
        val moves = MoveParser().convertMoveInstructionsToList("R2, R2, R2")
        moves.forEach {position.move(it)}

        test("I expect to be 2 blocks away") {
            assertThat(position.currentCoordinate.rectilinearDistanceFrom(start)).isEqualTo(2)

        }
    }

    describe("When I move R8, R4, R4, R8") {
        val position = Position(start, Direction.NORTH)
        val moves = MoveParser().convertMoveInstructionsToList("R8, R4, R4, R8")
        moves.forEach {position.move(it)}

        test("I expect the first coordinate where my paths cross to be 4 blocks away") {
            assertThat(position.firstDoubleCoordinate.rectilinearDistanceFrom(start)).isEqualTo(4)

        }
    }
})