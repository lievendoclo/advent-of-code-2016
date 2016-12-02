package be.insaneprogramming.adventofcode

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader

class InputStreamLineReader(inputStream: InputStream) {
    val streamReader: BufferedReader

    init {
        streamReader = BufferedReader(InputStreamReader(inputStream))
    }

    fun readLine(): String? = streamReader.readLine()
}
