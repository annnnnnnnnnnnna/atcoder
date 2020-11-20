package abc.`060`.a

import java.io.PrintWriter
import java.math.BigInteger
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (A, B, C ) = readLine()!!.split(' ')
    println(
        if (A.last() == B.first() && B.last() == C.first()) "YES"
        else "NO"
    )
}
