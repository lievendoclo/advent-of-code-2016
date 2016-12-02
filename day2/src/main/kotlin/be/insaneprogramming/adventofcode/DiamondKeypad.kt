package be.insaneprogramming.adventofcode

class DiamondKeypad(var currentKey: String) : Keypad {
    override fun moveUp() {
        currentKey = when(currentKey) {
            "3" -> "1"
            "6" -> "2"
            "7" -> "3"
            "8" -> "4"
            "A" -> "6"
            "B" -> "7"
            "C" -> "8"
            "D" -> "B"
            "1", "2", "4", "5", "9" -> currentKey
            else -> currentKey
        }
    }

    override fun moveDown() {
        currentKey = when(currentKey) {
            "1" -> "3"
            "2" -> "6"
            "3" -> "7"
            "4" -> "8"
            "6" -> "A"
            "7" -> "B"
            "8" -> "C"
            "B" -> "D"
            "5", "9", "A", "C", "D" -> currentKey
            else -> currentKey
        }
    }

    override fun moveLeft() {
        currentKey = when(currentKey) {
            "3" -> "2"
            "6" -> "5"
            "7" -> "6"
            "B" -> "A"
            "4" -> "3"
            "8" -> "7"
            "C" -> "B"
            "9" -> "8"
            "1", "2", "5", "A", "D" -> currentKey
            else -> currentKey
        }
    }

    override fun moveRight() {
        currentKey = when(currentKey) {
            "2" -> "3"
            "5" -> "6"
            "6" -> "7"
            "A" -> "B"
            "3" -> "4"
            "7" -> "8"
            "B" -> "C"
            "8" -> "9"
            "1", "4", "9", "C", "D" -> currentKey
            else -> currentKey
        }
    }
}