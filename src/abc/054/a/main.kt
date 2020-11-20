package abc.`054`.a

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (A, B) = readLine()!!.split(' ').map { it.toInt() }
    println(
        if (A == B) "Draw"
        else {
            when {
                A == 1 -> "Alice"
                B == 1 -> "Bob"
                A > B -> "Alice"
                else -> "Bob"
            }
        }
    )
}
