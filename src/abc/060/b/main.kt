package abc.`060`.b

import java.io.PrintWriter
import java.math.BigInteger
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (A, B, C) = readLine()!!.split(' ').map { it.toInt() }
    for (i in 1 .. 100) {
        if(A*i%B == C) {
            println("YES")
            return
        }
    }
    println("NO")
}
