package be.insaneprogramming.adventofcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class InputStreamLineReaderTest {
    @Test
    fun shouldReadASingleLine() {
        val inputStream = InputStreamLineReaderTest::class.java.getResourceAsStream("testfile.txt")
        val reader = InputStreamLineReader(inputStream)
        val line = reader.readFirstLine()
        assertThat(line).isEqualTo("line1")
    }
}