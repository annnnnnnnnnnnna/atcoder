package abc.`060`.c

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (N, T) = readLine()!!.split(' ').map { it.toInt() }
    val t = readLine()!!.split(' ').map { it.toInt() }
    var ans = 0L
    for (i in 1 until N) {
        ans += min (t[i]-t[i-1], T)
    }
    ans += T
    println(ans)
}
