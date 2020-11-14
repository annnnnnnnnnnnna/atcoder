package abc.`181`.c

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main(args: Array<String>) { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = readLine()!!.toInt()
    val arr = Array<Pair<Int,Int>>(N) { 0 to 0}
    repeat(N) {
        val (x, y) = readLine()!!.split(' ').map { it.toInt() }
        arr[it] = x to y
    }
    for (i in 0 until N) {
        for (j in 0 until N) {
            if (i != j) {
                val y = (arr[j].second - arr[i].second)
                val x = (arr[j].first - arr[i].first)
                for (k in 0 until N) {
                    if (j != k && i != k) {
                        if(x * (arr[k].second - arr[i].second) == y * (arr[k].first - arr[i].first)) {
                            println("Yes")
                            return
                        }
                    }
                }
            }
        }
    }
    println("No")
}
