package abc.`186`.d

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = readLine()!!.toInt()

    val A = readLine()!!.split(' ').map {
        it.toLong()
    }.sorted()

    val rwa = LongArray(N)
    rwa[N-1] = A[N-1]
    for (i in (1 until N-1).reversed()) {
        rwa[i] = rwa[i+1] + A[i]
    }

    var ans = 0L
    for (i in 0 until N-1) {
        ans += rwa[i+1] - (N-i-1) * A[i]
    }
    println(ans)
}
