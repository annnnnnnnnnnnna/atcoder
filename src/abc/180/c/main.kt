package abc.`180`.c

import java.io.PrintWriter

@JvmField val _writer = PrintWriter(System.out, false)
fun main(args: Array<String>) { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = readLine()!!.toLong()
    var r = 1L
    val ans = mutableSetOf<Long>()
    while (r*r <= N) {
        if (N%r == 0L) {
            ans.add(r)
            ans.add(N/r)
        }
        r++
    }
    ans.toList().sorted().forEach {
        println(it)
    }
}
