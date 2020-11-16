package abc.`182`.a

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (A, B) = readLine()!!.split(' ').map { it.toInt() }
    println((2*A+100)-B)
}
