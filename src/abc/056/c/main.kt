package abc.`056`.c

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val X = readLine()!!.toInt()
    var ans = 0L
    var tmp = 0L
    while(tmp < X) {
        ans++
        tmp+= ans
    }
    println(ans)
}
