package abc.`053`.a

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val x = readLine()!!.toInt()
    println(
        if(x< 1200) "ABC"
        else "ARC"
    )
}
