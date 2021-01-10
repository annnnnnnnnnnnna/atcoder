package arc.`080`.d

import java.io.PrintWriter
import java.util.*
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (H, W) = readLine()!!.split(' ').map { it.toInt() }
    val ans = Array(H) { IntArray(W) }
    val N = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toInt() }
    var aptr = 0
    var acnt = 0
    for (i in 0 until H) {
        val loop = if (i%2 == 0) {
            0 until W
        } else {
            W-1 downTo 0
        }
        for (j in loop) {
            ans[i][j] = aptr+1
            acnt++
            if (acnt == a[aptr]) {
                aptr++
                acnt = 0
            }
        }
    }

    ans.forEach {
        println(it.joinToString(" "))
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
