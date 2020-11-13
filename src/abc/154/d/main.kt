package abc.`154`.d

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main(args: Array<String>) { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (N, K) = readLine()!!.split(' ').map { it.toInt() }
    val p = readLine()!!.split(' ').map { (1.0+it.toDouble())/2.0 }
    var now = 0.0
    for (i in 0 until K) {
        now += p[i]
    }
    var ans = now
    for (i in K until N) {
        now -= p[i-K]
        now += p[i]
        ans = max(ans, now)
    }
    println("%.12f".format(ans))
}
