package abc.`053`.b

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val s = readLine()!!
    println(s.indexOfLast { it == 'Z' } - s.indexOfFirst { it == 'A' } + 1)
}
