package be.insaneprogramming.adventofcode

import io.damo.aspen.Test
import org.assertj.core.api.Assertions.assertThat

class DayTwoIntegrationTest : Test({
    describe("When I have instructions ULL RRDDD LURDL UUUUD with a standard keypad") {
        val keypadLayout : String = "123\n456\n789"
        val keypad = Keypad(keypadLayout)
        val solver = CodeSolver(keypad)
        solver.startAt(Coordinate(1, 1))

        test("I expect the code to be 1985") {
            val code = solver.getCode("ULL\nRRDDD\nLURDL\nUUUUD")
            assertThat(code).isEqualTo("1985")
        }
    }

    describe("When I have instructions ULL RRDDD LURDL UUUUD with a diamond keypad") {
        val keypadLayout : String = "  1  \n 234 \n56789\n ABC \n  D  "
        val keypad = Keypad(keypadLayout)
        val solver = CodeSolver(keypad)
        solver.startAt(Coordinate(0, 2))

        test("I expect the code to be 5DB3") {
            val code = solver.getCode("ULL\nRRDDD\nLURDL\nUUUUD")
            assertThat(code).isEqualTo("5DB3")
        }
    }
})