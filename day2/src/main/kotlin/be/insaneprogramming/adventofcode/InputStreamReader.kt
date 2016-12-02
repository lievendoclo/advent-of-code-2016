package be.insaneprogramming.adventofcode

import java.io.InputStream

class InputStreamReader(val inputStream: InputStream) {
    fun readAll(): String = inputStream.buffered().bufferedReader().lines().reduce { t, u -> t.plus("\n").plus(u) }.get()
}
