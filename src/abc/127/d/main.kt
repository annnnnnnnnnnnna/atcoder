package abc.`127`.d

import java.io.PrintWriter
import java.util.*
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (N, M) = readLine()!!.split(' ').map { it.toInt() }
    val A = readLine()!!.split(' ').map { it.toLong() }.sorted().toTypedArray()
    val BC = (1..M).map {
        val (B, C) = readLine()!!.split(' ').map { it.toLong() }
        B.toInt() to C
    }.sortedByDescending { it.second }

    var aptr = 0
    var bptr = 0
    var cptr = 0
    while(aptr < N && cptr < M && A[aptr] < BC[cptr].second) {
        A[aptr] = BC[cptr].second
        bptr++
        if (bptr == BC[cptr].first) {
            cptr++
            bptr = 0
        }
        aptr++
    }
    println(A.sum())
}

private var st = StringTokenizer("")
private val br = System.`in`.bufferedReader()

fun next(): String {
    while (!st.hasMoreTokens()) st = StringTokenizer(br.readLine())
    return st.nextToken()
}
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun nextLine() = br.readLine()
fun nextDouble() = next().toDouble()
