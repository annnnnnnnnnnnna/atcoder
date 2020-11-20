package abc.`055`.b

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = readLine()!!.toInt()
    var ans = 1L
    for( i in 1 .. N) {
        ans *= i
        ans %= 1000000007
    }
    println(ans)
}
