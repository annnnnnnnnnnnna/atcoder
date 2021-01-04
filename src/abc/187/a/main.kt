package abc.`187`.a

import java.io.PrintWriter

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    println(
        readLine()!!.split(' ').map {
            it.map { it - '0' }.sum()
        }.max()
    )
}
