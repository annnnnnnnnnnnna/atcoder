package abc.`064`.d

import java.io.PrintWriter
import java.lang.Math.pow
import java.lang.StringBuilder
import java.util.*
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = nextInt()
    val S = nextLine()!!
    var l = 0
    var ll = 0
    var r = 0
    var rr = 0

    val ans = StringBuilder()

    for (i in 0 until N) {
        when(S[i]) {
            '(' -> l++
            ')' -> {
                if (l == 0) ll++
                else l--
            }
        }
        when(S[N-1-i]) {
            ')' -> r++
            '(' -> {
                if (r == 0) rr++
                else r--
            }
        }
    }
    println("${"(".repeat(ll)}$S${")".repeat(rr)}")
    println(ans)
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
