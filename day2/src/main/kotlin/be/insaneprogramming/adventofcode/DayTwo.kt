
package be.insaneprogramming.adventofcode

class DayTwo {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var keypad : Keypad
            var codeSolver: CodeSolver
            val movesFromFile = getContentFromFile()

            println("With standard keypad")
            keypad = Keypad("123\n456\n789")
            codeSolver = CodeSolver(keypad)
            codeSolver.startAt(Coordinate(1, 1))
            println(codeSolver.getCode(movesFromFile))

            println("With diamond keypad")
            keypad = Keypad("  1  \n 234 \n56789\n ABC \n  D  ")
            codeSolver = CodeSolver(keypad)
            codeSolver.startAt(Coordinate(0, 2))
            println(codeSolver.getCode(movesFromFile))
        }

        private fun getContentFromFile(): String {
            val reader = InputStreamReader(MoveParser::class.java.getResourceAsStream("input.txt"))
            return reader.readAll()
        }
    }
}