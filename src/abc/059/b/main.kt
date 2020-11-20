package abc.`059`.b

import java.io.PrintWriter
import java.math.BigInteger
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val A = BigInteger(readLine()!!)
    val B = BigInteger(readLine()!!)
    println(
        when {
            A > B -> "GREATER"
            A == B -> "EQUAL"
            else -> "LESS"
        }
    )
}
