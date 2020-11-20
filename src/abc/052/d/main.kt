package abc.`052`.d

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (N, A, B) = readLine()!!.split(' ').map { it.toInt() }
    val X = readLine()!!.split(' ').map { it.toLong() }

    var pos = X[0]
    var ans = 0L
    for (i in 1 until N) {
        val next = X[i] - pos
        ans += min(next * A.toLong(), B.toLong())
        pos = X[i]
    }
    println(ans)
}
