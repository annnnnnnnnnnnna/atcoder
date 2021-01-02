package abc.`080`.c

import java.io.PrintWriter
import java.lang.Math.pow
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = readLine()!!.toInt()

    val F = (1..N).map {
        readLine()!!.split(' ').map { it.toInt() }
    }
    val P = (1..N).map {
        readLine()!!.split(' ').map { it.toInt() }
    }

    fun check(ptn: List<Boolean>): Long {
        var point = 0L
        (0 until N).forEach { i ->
            var cnt = 0
            (0..9).forEach { t ->
                if (F[i][t] == 1 && ptn[t]) cnt++
            }
            point += P[i][cnt]
        }
        return point
    }

    fun bitFullSearch(chkFunc: (List<Boolean>) -> Long, digits: Int, start: Int = 0): Long {
        val end = 2.0.pow(digits.toDouble()).toInt()
        var ans = Long.MIN_VALUE
        val zero = "0".repeat(digits)
        for (i in start .. end) {
            ans = max(ans, chkFunc("$zero${i.toString(2)}".takeLast(digits).map { it == '1' }))
        }
        return ans
    }

    println(bitFullSearch(::check, 10, 1))
}
