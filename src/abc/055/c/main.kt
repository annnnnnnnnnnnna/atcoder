package abc.`055`.c

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (N, M) = readLine()!!.split(' ').map { it.toLong() }

    val cNokori = M - 2*N
    println(
        if (cNokori >= 0L) N+cNokori/4L
        else M/2L
    )
}
