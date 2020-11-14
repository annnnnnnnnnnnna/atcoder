package abc.`164`.a

import java.io.PrintWriter

@JvmField val _writer = PrintWriter(System.out, false)
fun main(args: Array<String>) { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (s, w) = readLine()!!.split(' ').map { it.toInt() }
    if (s > w) {
        println("safe")
    } else {
        println("unsafe")
    }
}
