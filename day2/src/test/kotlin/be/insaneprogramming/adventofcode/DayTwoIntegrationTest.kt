package be.insaneprogramming.adventofcode

import io.damo.aspen.Test
import org.assertj.core.api.Assertions.assertThat

class DayTwoIntegrationTest : Test({
    describe("When I move have instructions ULL RRDDD LURDL UUUUD with a standard keypad") {
        val keypadLayout : String = "123\n456\n789"
        val keypad = Keypad(keypadLayout, Coordinate(1, 1))
        val moveParser = MoveParser()

        test("I expect to be at position 1") {
            val convertMoveInstructionsToList = moveParser.convertMoveInstructionsToList("ULL")
            convertMoveInstructionsToList.forEach {it.direction.apply(keypad)}
            assertThat(keypad.getCurrentKey()).isEqualTo("1")
        }

        test("I expect to be at position 9") {
            val convertMoveInstructionsToList = moveParser.convertMoveInstructionsToList("RRDDD")
            convertMoveInstructionsToList.forEach {it.direction.apply(keypad)}
            assertThat(keypad.getCurrentKey()).isEqualTo("9")
        }

        test("I expect to be at position 8") {
            val convertMoveInstructionsToList = moveParser.convertMoveInstructionsToList("LURDL")
            convertMoveInstructionsToList.forEach {it.direction.apply(keypad)}
            assertThat(keypad.getCurrentKey()).isEqualTo("8")
        }

        test("I expect to be at position 5") {
            val convertMoveInstructionsToList = moveParser.convertMoveInstructionsToList("UUUUD")
            convertMoveInstructionsToList.forEach {it.direction.apply(keypad)}
            assertThat(keypad.getCurrentKey()).isEqualTo("5")
        }
    }

    describe("When I move have instructions ULL RRDDD LURDL UUUUD with a diamond keypad") {
        val keypadLayout : String = "  1  \n 234 \n56789\n ABC \n  D  "
        val keypad = Keypad(keypadLayout, Coordinate(0, 2))
        val moveParser = MoveParser()

        test("I expect to be at position 5") {
            val convertMoveInstructionsToList = moveParser.convertMoveInstructionsToList("ULL")
            convertMoveInstructionsToList.forEach {it.direction.apply(keypad)}
            assertThat(keypad.getCurrentKey()).isEqualTo("5")
        }

        test("I expect to be at position D") {
            val convertMoveInstructionsToList = moveParser.convertMoveInstructionsToList("RRDDD")
            convertMoveInstructionsToList.forEach {it.direction.apply(keypad)}
            assertThat(keypad.getCurrentKey()).isEqualTo("D")
        }

        test("I expect to be at position B") {
            val convertMoveInstructionsToList = moveParser.convertMoveInstructionsToList("LURDL")
            convertMoveInstructionsToList.forEach {it.direction.apply(keypad)}
            assertThat(keypad.getCurrentKey()).isEqualTo("B")
        }

        test("I expect to be at position 3") {
            val convertMoveInstructionsToList = moveParser.convertMoveInstructionsToList("UUUUD")
            convertMoveInstructionsToList.forEach {it.direction.apply(keypad)}
            assertThat(keypad.getCurrentKey()).isEqualTo("3")
        }
    }
})