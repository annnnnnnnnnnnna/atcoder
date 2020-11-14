package abc.`163`.c

import java.io.PrintWriter

@JvmField val OUTPUT = System.out
@JvmField val _writer = PrintWriter(OUTPUT, false)
fun main(args: Array<String>) { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toInt() }

    val ans = IntArray(n){0}
    repeat(a.size) {
        ans[a[it]-1]++
    }

    ans.forEach {
        println(it)
    }
}
