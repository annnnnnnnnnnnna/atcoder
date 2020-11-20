package abc.`058`.a

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (a,b, c ) = readLine()!!.split(' ').map { it.toInt() }
    println(
        if(b-a == c-b) "YES"
        else "NO"
    )
}
