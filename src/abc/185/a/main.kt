package abc.`185`.a

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (a1, a2, a3, a4) = readLine()!!.split(' ').map { it.toInt() }
    var ans = 0
    println(min(min(a1,a2),min(a3,a4)))
}
