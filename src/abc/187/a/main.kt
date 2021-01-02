package abc.`187`.a

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (A, B) = readLine()!!.split(' ')
    fun S(x: String): Int {
        var ret = 0
        x.forEach {
            ret += it.toString().toInt()
        }
        return ret
    }
    println(max(S(A),S(B)))
}
