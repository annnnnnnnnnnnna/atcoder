package abc.`186`.a

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (N, W) = readLine()!!.split(' ').map { it.toInt() }
    var ans = 0
    println(N/W)
}
