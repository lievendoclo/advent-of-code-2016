package be.insaneprogramming.adventofcode

import io.damo.aspen.Test
import org.assertj.core.api.Assertions.assertThat

class DayTwoIntegrationTest : Test({
    describe("When I move have instructions ULL RRDDD LURDL UUUUD with a standard keypad") {
        val keypad = StandardKeypad(5)
        val moveParser = MoveParser()

        test("I expect to be at position 1") {
            val convertMoveInstructionsToList = moveParser.convertMoveInstructionsToList("ULL")
            convertMoveInstructionsToList.forEach {it.direction.apply(keypad)}
            assertThat(keypad.currentKey).isEqualTo(1)
        }

        test("I expect to be at position 9") {
            val convertMoveInstructionsToList = moveParser.convertMoveInstructionsToList("RRDDD")
            convertMoveInstructionsToList.forEach {it.direction.apply(keypad)}
            assertThat(keypad.currentKey).isEqualTo(9)
        }

        test("I expect to be at position 8") {
            val convertMoveInstructionsToList = moveParser.convertMoveInstructionsToList("LURDL")
            convertMoveInstructionsToList.forEach {it.direction.apply(keypad)}
            assertThat(keypad.currentKey).isEqualTo(8)
        }

        test("I expect to be at position 5") {
            val convertMoveInstructionsToList = moveParser.convertMoveInstructionsToList("UUUUD")
            convertMoveInstructionsToList.forEach {it.direction.apply(keypad)}
            assertThat(keypad.currentKey).isEqualTo(5)
        }
    }

    describe("When I move have instructions ULL RRDDD LURDL UUUUD with a diamond keypad") {
        val keypad = DiamondKeypad("5")
        val moveParser = MoveParser()

        test("I expect to be at position 5") {
            val convertMoveInstructionsToList = moveParser.convertMoveInstructionsToList("ULL")
            convertMoveInstructionsToList.forEach {it.direction.apply(keypad)}
            assertThat(keypad.currentKey).isEqualTo("5")
        }

        test("I expect to be at position D") {
            val convertMoveInstructionsToList = moveParser.convertMoveInstructionsToList("RRDDD")
            convertMoveInstructionsToList.forEach {it.direction.apply(keypad)}
            assertThat(keypad.currentKey).isEqualTo("D")
        }

        test("I expect to be at position B") {
            val convertMoveInstructionsToList = moveParser.convertMoveInstructionsToList("LURDL")
            convertMoveInstructionsToList.forEach {it.direction.apply(keypad)}
            assertThat(keypad.currentKey).isEqualTo("B")
        }

        test("I expect to be at position 3") {
            val convertMoveInstructionsToList = moveParser.convertMoveInstructionsToList("UUUUD")
            convertMoveInstructionsToList.forEach {it.direction.apply(keypad)}
            assertThat(keypad.currentKey).isEqualTo("3")
        }
    }
})