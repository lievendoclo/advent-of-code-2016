
package be.insaneprogramming.adventofcode

class DayTwo {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var keypad : Keypad
            println("With standard keypad")
            keypad = StandardKeypad(5)
            val movesFromFile = getMovesFromFile()
            for(movesList in movesFromFile) {
                for(move in movesList) {
                    move.direction.apply(keypad)
                }
                print(keypad.currentKey)
            }
            println()
            println("With diamond keypad")
            keypad = DiamondKeypad("5")
            for(movesList in movesFromFile) {
                for(move in movesList) {
                    move.direction.apply(keypad)
                }
                print(keypad.currentKey)
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