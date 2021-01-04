package abc.`187`.d

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = readLine()!!.toInt()
    var all = 0L
    (1..N).map {
        val (A, B) = readLine()!!.split(' ').map { it.toLong() }
        all += A
        A*2+B
    }.sortedByDescending {
        it
    }.forEachIndexed { index, ab ->
        all -= ab
        if (all < 0) {
            println(index+1)
            return
        }
    }
}
