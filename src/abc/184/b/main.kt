package abc.`184`.b

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    var (N, X) = readLine()!!.split(' ').map { it.toLong() }
    val S = readLine()!!
    for (i in S.indices) {
        if (S[i] == 'o') X++
        else if (S[i] == 'x' && X > 0) X--
    }
    println(X)
}
