package abc.`056`.a

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (a, b) = readLine()!!.split(' ')
    println(
        if (a == b) "H"
        else "D"
    )
}
