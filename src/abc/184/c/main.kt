package abc.`184`.c

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (r1, c1) = readLine()!!.split(' ').map { it.toLong() }
    val (r2, c2) = readLine()!!.split(' ').map { it.toLong() }
    if (r1 == r2 && c1 == c2) {
        println(0)
        return
    }

    if (r1 + c1 == r2 + c2 ||
        r1 - c1 == r2 - c2 ||
        abs(r1 - r2) + abs(c1 - c2) <= 3) {
        println(1)
        return
    }


    if ((r1+r2+c1+c2) %2L == 0L || abs((r1+c1)-(r2+c2)) <= 3 || abs((r1-c1)-(r2-c2)) <= 3 || abs(r1 - r2) + abs(c1 - c2) <= 6) {
        println(2)
        return
    }

    println(3)
    return
}
