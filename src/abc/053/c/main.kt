package abc.`053`.c

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val x = readLine()!!.toLong()
    if (x <= 6) {
        println(1)
        return
    }
    val eleven = x / 11
    val nokori = x - eleven * 11
    println(eleven*2 + if(nokori == 0L) 0 else if (nokori <= 6L) 1 else 2)
}
