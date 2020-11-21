package arc.`108`.a

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (S, P) = readLine()!!.split(' ').map { it.toLong() }
    val s = sqrt(P.toDouble()).toLong()

    for (n in 1 .. s) {
        if(P%n == 0L) {
            val m = P / n
            if(n+m == S) {
                println("Yes")
                return
            }
        }
    }
    println("No")
}
