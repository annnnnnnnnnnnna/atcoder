package abc.`064`.c

import java.io.PrintWriter
import java.util.*
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = nextInt()
    val rate = BooleanArray(8) { false }
    var free = 0
    nextLine()!!.split(' ').forEach {
        val a = it.toInt()
        if (a >= 3200) free++
        else {
            rate[a/400] = true
        }
    }
    val ans = rate.filter { it }.size
    println("${max(ans, 1)} ${ ans + free }")
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
