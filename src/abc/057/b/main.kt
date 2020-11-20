package abc.`057`.b

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (N, M) = readLine()!!.split(' ').map { it.toInt() }
    val students = (1..N).map {
        val (a, b) = readLine()!!.split(' ').map { it.toInt() }
        a to b
    }
    val points = (1..M).map {
        val (c, d) = readLine()!!.split(' ').map { it.toInt() }
        c to d
    }

    fun dist(s: Pair<Int, Int>, p: Pair<Int, Int>): Int
            = abs(s.first - p.first) + abs(s.second - p.second)

    for (i in 0 until N) {
        var ans = -1
        var min = Int.MAX_VALUE
        for (j in 0 until M) {
            val d = dist(students[i], points[j])
            if(d < min) {
                min = d
                ans = j+1
            }
        }
        println(ans)
    }
}
