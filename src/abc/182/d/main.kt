package abc.`182`.d

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = readLine()!!.toInt()
    val cusum = LongArray(N+1) //累積和
    val cucusum = LongArray(N+1)
    val A = readLine()!!.split(' ').map { it.toInt() }
    var ans = 0L

    var cusumMax = 0L
    for (i in 0 .. N) {
        cusum[i] = (cusum.getOrElse(i-1){0}) + A.getOrElse(i-1){0}
        cusumMax = max(cusumMax, cusum[i])
        cucusum[i] = cusum[i] + (cucusum.getOrElse(i-1){0})
        ans = max(ans,cucusum.getOrElse(i-1){0} + cusumMax)
    }

    println(ans)
}
