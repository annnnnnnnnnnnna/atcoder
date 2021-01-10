package abc.`084`.c

import java.io.PrintWriter
import java.util.*
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = nextInt()
    val CSF = (1 until N).map {
        val C = nextLong()
        val S = nextLong()
        val F = nextLong()
        Triple(C, S, F)
    }
    val time = LongArray(N)
    for (i in 0 until N-1) {
        val schedule = CSF[i]
        for (j in 0 .. i) {
            // 到着時刻の次の発車時刻
            val S = schedule.second
            val F = schedule.third
            val now = time[j]
            if (S >= now) {
                time[j] = S
            } else {
                val times = (now - S)/F
                time[j] = (times + (if ((now - S)%F != 0L) 1 else 0))* F + S
            }
            time[j] += schedule.first
        }
    }
    time.forEach {
        println(it)
    }
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
