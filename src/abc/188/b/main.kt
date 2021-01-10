package abc.`188`.b

import java.io.PrintWriter
import java.util.*
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(' ').map { it.toInt() }
    val B = readLine()!!.split(' ').map { it.toInt() }
    var ans = 0
    for (i in 0 until N) {
        ans += A[i]*B[i]
    }
    if (ans == 0) println("Yes")
    else  println("No")
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
