package arc.`107`.b

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main(args: Array<String>) { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (N, K) = readLine()!!.split(' ').map { it.toLong() }
    var ans = 0L

    val plusMin = max(K+2L, 2L)
    val plusMax = 2L*N
    for (i in plusMin .. plusMax) {
        val plusSelectMin = max(1, i-N)
        val plusSelectMax = min(i-1, N)
        val plus = plusSelectMax - plusSelectMin + 1

        val minsSelectMin = max(1, i-N-K)
        val minsSelectMax = min(i-1-K, N)
        val minus = minsSelectMax - minsSelectMin + 1

        if (plus > 0 && minus > 0) ans += plus * minus
    }
    println(ans)
}
