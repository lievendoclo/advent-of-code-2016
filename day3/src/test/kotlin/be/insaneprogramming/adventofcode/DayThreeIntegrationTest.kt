package be.insaneprogramming.adventofcode

import io.damo.aspen.Test
import org.assertj.core.api.Assertions.assertThat

class DayThreeIntegrationTest : Test({
    describe("If I have a triangle with sides size 5, 10 and 25") {
        val triangle = Triangle(listOf(5, 10, 25))

        test("I expect it to be an invalid triangle") {
            assertThat(triangle.isValid()).isFalse()
        }
    }
})