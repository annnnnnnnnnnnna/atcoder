package abc.`061`.b

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (N, M) = readLine()!!.split(' ').map { it.toInt() }

    val arr = IntArray(N)
    repeat(M) {
        val (a, b) = readLine()!!.split(' ').map { it.toInt() - 1 }
        arr[a]++
        arr[b]++
    }
    arr.forEach {
        println(it)
    }

}
