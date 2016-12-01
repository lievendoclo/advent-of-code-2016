package be.insaneprogramming.adventofcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class CoordinateTest {
    @Test
    fun testRectilinearDistanceBetweenCoordinates() {
        assertThat(Coordinate(0, 0).rectilinearDistanceFrom(Coordinate(2, 2))).isEqualTo(4)
        assertThat(Coordinate(0, 1).rectilinearDistanceFrom(Coordinate(2, 3))).isEqualTo(4)
        assertThat(Coordinate(-1, -1).rectilinearDistanceFrom(Coordinate(2, 2))).isEqualTo(6)
        assertThat(Coordinate(1, -1).rectilinearDistanceFrom(Coordinate(2, 2))).isEqualTo(4)
    }
}