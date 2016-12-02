
package be.insaneprogramming.adventofcode

class DayTwo {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var keypad : Keypad
            var keypadLayout : String

            println("With standard keypad")
            keypadLayout = "123\n456\n789"
            keypad = Keypad(keypadLayout, Coordinate(1, 1))
            val movesFromFile = getMovesFromFile()
            for(movesList in movesFromFile) {
                for(move in movesList) {
                    move.direction.apply(keypad)
                }
                print(keypad.getCurrentKey())
            }
            println()
            println("With diamond keypad")
            keypadLayout = "  1  \n 234 \n56789\n ABC \n  D  "
            keypad = Keypad(keypadLayout, Coordinate(0, 2))
            for(movesList in movesFromFile) {
                for(move in movesList) {
                    move.direction.apply(keypad)
                }
                print(keypad.getCurrentKey())
            }
        }

        private fun getMovesFromFile(): List<List<Move>> {
            val reader = InputStreamLineReader(MoveParser::class.java.getResourceAsStream("input.txt"))
            val movesList : MutableList<List<Move>> = mutableListOf()
            var moveInstructionLine = reader.readLine()
            while(moveInstructionLine?.isNotBlank() ?: false) {
                val moves = MoveParser().convertMoveInstructionsToList(moveInstructionLine!!)
                movesList.add(moves)
                moveInstructionLine = reader.readLine()
            }
            return movesList
        }
    }
}