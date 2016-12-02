package be.insaneprogramming.adventofcode

class StandardKeypad(var currentKey: Int) : Keypad {
    override fun moveUp() {
        if(currentKey > 3) {
            currentKey -= 3
        }
    }

    override fun moveDown() {
        if(currentKey < 7) {
            currentKey += 3
        }
    }

    override fun moveLeft() {
        if(currentKey % 3 != 1) {
            currentKey -= 1
        }
    }

    override fun moveRight() {
        if(currentKey % 3 != 0) {
            currentKey += 1
        }
    }
}