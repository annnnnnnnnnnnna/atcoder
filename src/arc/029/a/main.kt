package arc.`029`.a

import java.io.PrintWriter
import java.util.*
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = nextInt()
    val t = (1..N).map { nextInt() } + (N..3).map { 0 }

    val all = (1..3).map{it}
    val a = 0
    println(
        (1..3).map { b ->
            (1..3).map { c ->
                if (b != c) {
                    val d = all.minus(b).minus(c).first()
                    listOf(
                        max(t[a], t[b] + t[c] + t[d]),
                        max(t[a] + t[b], t[c] + t[d]),
                        max(t[a] + t[b] + t[c], t[d])
                    )
                } else {
                    listOf()
                }
            }.flatten()
        }.flatten()
            .min()
    )
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
