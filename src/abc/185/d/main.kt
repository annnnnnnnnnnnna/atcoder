package abc.`185`.d

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (N, M) = readLine()!!.split(' ').map { it.toInt() }
    if (M == 0) {
        println(1)
        return
    }
    val A = readLine()!!.split(' ').map { it.toInt() }.sorted()

    var distMin = if(A[0] - 1 != 0) A[0] -1 else Int.MAX_VALUE
    for (i in 1 until M) {
        if (A[i] - A[i-1] - 1 != 0) distMin = min (distMin, A[i] - A[i-1] - 1)
    }
    val lastDist = N - A.last()
    if (lastDist > 0) {
        distMin = min(distMin, N - A.last())
    }

    var ans = 0
    var firstDist = if(A[0] - 1 != 0) A[0] -1 else 0
    if (firstDist % distMin == 0) {
        ans += firstDist/distMin
    } else {
        ans += firstDist/distMin + 1
    }

    for (i in 1 until M) {
        val dist = A[i] - A[i-1] - 1
        if (dist % distMin == 0) {
            ans += dist/distMin
        } else {
            ans += dist/distMin + 1
        }
    }
    if (lastDist > 0) {
        if (lastDist % distMin == 0) {
            ans += lastDist/distMin
        } else {
            ans += lastDist/distMin + 1
        }
    }
    println(ans)
}
