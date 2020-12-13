package abc.`061`.c

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (N, K) = readLine()!!.split(' ').map { it.toLong() }

    val arr = (1..N).map {
        val (a, b) = readLine()!!.split(' ').map { it.toInt() }
        a to b
    }.sortedBy { it.first }

    var kk = K
    var ix = 0
    var ans = arr[ix].first
    while (kk > 0) {
        val ab = arr.getOrElse(ix) { arr.last() }
        ans = ab.first
        kk -= ab.second
        ix++
    }
    println(ans)
}
