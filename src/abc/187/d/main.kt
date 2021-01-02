package abc.`187`.d

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = readLine()!!.toInt()
    var all = 0L
    val AB = (1..N).map {
        val (A, B) = readLine()!!.split(' ').map { it.toLong() }
        all += A
        A*2+B
    }.sortedByDescending { it }
    for (i in 0 until N) {
        all -= AB[i]
        if (all < 0) {
            println(i+1)
            return
        }
    }
}
