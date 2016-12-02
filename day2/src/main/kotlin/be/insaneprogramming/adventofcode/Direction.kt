package be.insaneprogramming.adventofcode

enum class Direction(val moveFunction: (Keypad) -> Unit) {
    UP({it.moveUp()}),
    DOWN({it.moveDown()}),
    LEFT({it.moveLeft()}),
    RIGHT({it.moveRight()});

    fun apply(keypad: Keypad) {
        moveFunction(keypad)
    }
}