package abc.`182`.b

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(' ').map { it.toInt() }
    var gcd = 0
    var ans = -1
    for (i in 2 .. 1000) {
        var tmp = 0
        A.forEach {
            if(it % i == 0) tmp++
        }
        if(gcd <= tmp) {
            gcd = tmp
            ans = i
        }
        if (gcd == N) break
    }
    println(ans)
}
