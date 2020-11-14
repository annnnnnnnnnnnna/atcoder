package abc.`164`.c

import java.io.PrintWriter

@JvmField val _writer = PrintWriter(System.out, false)
fun main(args: Array<String>) { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    var n = readLine()!!.toInt()
    val ans = mutableSetOf<String>()
    repeat(n) {
        ans.add(readLine()!!)
    }
    println(ans.size)
}
