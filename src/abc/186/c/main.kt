package abc.`186`.c

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = readLine()!!.toInt()

    var ans = 0
    for (i in 1..N) {
        val d = i.toString()
        val o =  Integer.toOctalString(i)
        if ("7" !in d && "7" !in o) {
            ans++
        }
    }
    println(ans)
}
