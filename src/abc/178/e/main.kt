package abc.`178`.e

import java.io.PrintWriter

@JvmField val _writer = PrintWriter(System.out, false)
fun main(args: Array<String>) { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = readLine()!!.toInt()
    val plus = LongArray(N)
    val minus = LongArray(N)
    repeat(N) {
        val (X, Y) = readLine()!!.split(' ').map { it.toLong() }
        plus[it] = X+Y
        minus[it] = X-Y
    }
    println(Math.max(plus.max()!! - plus.min()!!, minus.max()!! - minus.min()!!))
}
