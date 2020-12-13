package abc.`062`.b

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (H, W) = readLine()!!.split(' ').map { it.toInt() }
    println("#".repeat(W+2))
    repeat(H) {
        println("#${readLine()!!}#")
    }
    println("#".repeat(W+2))
}
