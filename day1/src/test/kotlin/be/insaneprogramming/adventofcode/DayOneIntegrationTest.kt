package be.insaneprogramming.adventofcode

import io.damo.aspen.Test
import org.assertj.core.api.Assertions.assertThat

class DayOneIntegrationTest : Test({
    val start = Coordinate(0, 0)

    describe("When I move R2, L3") {
        val traveler = Traveler(Position(start, Direction.NORTH))
        traveler.travel("R2, L3")

        test("I expect to be 5 blocks away from where I started") {
            assertThat(traveler.position.currentCoordinate.calculateRectilinearDistanceFrom(start)).isEqualTo(5)
        }
    }

    describe("When I move R2, R2, R2") {
        val traveler = Traveler(Position(start, Direction.NORTH))
        traveler.travel("R2, R2, R2")

        test("I expect to be 2 blocks away from where I started") {
            assertThat(traveler.position.currentCoordinate.calculateRectilinearDistanceFrom(start)).isEqualTo(2)
        }
    }

    describe("When I move R2, R2, R2") {
        val traveler = Traveler(Position(start, Direction.NORTH))
        traveler.travel("R2, R2, R2")

        test("I expect to be 2 blocks away from where I started") {
            assertThat(traveler.position.currentCoordinate.calculateRectilinearDistanceFrom(start)).isEqualTo(2)
        }
    }

    describe("When I move R8, R4, R4, R8") {
        val traveler = Traveler(Position(start, Direction.NORTH))
        traveler.travel("R8, R4, R4, R8")

        test("I expect the first place where my paths cross to be 4 blocks away from where I started") {
            assertThat(traveler.getCrossings().first().calculateRectilinearDistanceFrom(start)).isEqualTo(4)
        }
    }
})