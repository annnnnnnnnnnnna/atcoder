package abc.`188`.d

import java.io.PrintWriter
import java.util.*
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (N, C) = readLine()!!.split(' ').map { it.toLong() }
    val plan = mutableMapOf<Long, Long>()
    for (i in 0 until N) {
        val a = nextLong()
        val b = nextLong()
        val c = nextLong()
        if (plan[a] == null) plan[a] = 0
        plan[a] = plan[a]!! + c
        if (plan[b+1] == null) plan[b+1] = 0
        plan[b+1] = plan[b+1]!! + c * -1
    }
    var now = 1L
    var plice = 0L
    var ans = 0L
    plan.keys.sorted().forEach {
        val kikan = it - now
        ans += kikan * min(plice, C)
        plice += plan[it]!!
        now = it
    }
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
