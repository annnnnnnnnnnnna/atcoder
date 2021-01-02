package abc.`186`.b

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (H, W) = readLine()!!.split(' ').map { it.toInt() }
    var min = Int.MAX_VALUE
    val A = (1..H).map {
        val a = readLine()!!.split(' ').map { it.toInt() }
        min = min(min, a.min()!!)
        a
    }
    var ans = 0L
    for (i in 0 until H) {
        for (j in 0 until W) {
            ans += A[i][j] - min
        }
    }
    println(ans)
}
