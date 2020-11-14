package abc.`181`.b

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main(args: Array<String>) { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = readLine()!!.toInt()
    var ans = 0L
    repeat(N) {
        val (A, B) = readLine()!!.split(' ').map { it.toLong() }
        ans += ((A+B)*(B-A+1))/2
    }
    println(ans)
}
