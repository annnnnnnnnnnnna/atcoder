package abc.`185`.c

import java.io.PrintWriter
import java.math.BigDecimal
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val L = readLine()!!.toLong()
    println(nCr(L-1L, 11))
}

fun nCr(n: Long, r: Long): BigDecimal {
    if (n == 0L || r == 0L) return BigDecimal.ONE
    val bN = BigDecimal(n)
    var ans = BigDecimal.ONE
    var bunbo = BigDecimal.ONE
    val limit = min(r, n-r)
    for (i in 0 until limit) {
        val bI = BigDecimal(i)
        ans *= bN-bI
        bunbo *= bI+BigDecimal.ONE
    }
    return ans/bunbo
}
