package abc.`062`.a

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (x, y) = readLine()!!.split(' ').map { it.toInt() }
    val a = setOf(1, 3, 5, 7, 8, 10, 12)
    val b = setOf(4, 6, 9, 11)
    val c = setOf(2)
    println(
        if (x in a && y in a || x in b && y in b || x in c && y in c) "Yes"
        else "No"
    )
}
