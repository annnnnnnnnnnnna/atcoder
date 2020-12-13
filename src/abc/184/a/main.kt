package abc.`184`.a

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (a, b) = readLine()!!.split(' ').map { it.toInt() }
    val (c, d) = readLine()!!.split(' ').map { it.toInt() }
    println(a*d-b*c)
}
