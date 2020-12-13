package abc.`061`.a

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (A, B, C) = readLine()!!.split(' ').map { it.toInt() }
    println(
        if (C in A..B) "Yes"
        else "No"
    )
}
