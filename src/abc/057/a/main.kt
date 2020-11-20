package abc.`057`.a

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (A, B) = readLine()!!.split(' ').map { it.toInt() }
    println(A+B - if(A+B >= 24) 24 else 0)
}
