package abc.`180`.a

import java.io.PrintWriter

@JvmField val _writer = PrintWriter(System.out, false)
fun main(args: Array<String>) { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (N,A,B ) = readLine()!!.split(' ').map { it.toInt() }
    println(N-A+B)
}
