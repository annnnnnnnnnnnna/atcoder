package abc.`059`.a

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (s1, s2, s3) = readLine()!!.split(' ')
    println("${s1[0]}${s2[0]}${s3[0]}".toUpperCase())
}
