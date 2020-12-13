package abc.`185`.b

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (N, M, T) = readLine()!!.split(' ').map { it.toInt() }
    var batt = N
    var now = 0
    repeat(M) {
        val (A, B) = readLine()!!.split(' ').map { it.toInt() }
        batt -= A-now
        if (batt <= 0 ) {
            println("No")
            return
        }
        batt = min(N, batt+B-A)
        now = B
    }
    batt -= T-now
    if (batt <= 0 ) {
        println("No")
    } else {
        println("Yes")
    }
}
