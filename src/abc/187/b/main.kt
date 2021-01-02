package abc.`187`.b

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = readLine()!!.toInt()
    val xy = (1..N).map {
        val (x, y) = readLine()!!.split(' ').map { it.toDouble() }
        x to y
    }
    var ans = 0
    for (i in 0 until N-1) {
        val xyi = xy[i]
        for (j in i+1 until N) {
            val xyj = xy[j]
            val x = xyj.first - xyi.first
            val y = xyj.second - xyi.second
            if (y/x >= -1.0 && y/x <= 1.0) ans++
        }
    }
    println (ans)
}
