package be.insaneprogramming.adventofcode

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader

class InputStreamLineReader(val inputStream: InputStream) {
    fun readFirstLine(): String {
        val streamReader = BufferedReader(InputStreamReader(inputStream))
        return streamReader.readLine()
    }
}
