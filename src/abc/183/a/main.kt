package abc.`183`.a

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val x = readLine()!!.toInt()
    println(
        if (x > 0) x
        else 0
    )
}
