package abc.`157`.c

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main(args: Array<String>) { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (N, M) = readLine()!!.split(' ').map { it.toInt() }
    val max = Math.pow(10.0, N.toDouble()).toInt() - 1
    val min = when(N) {
        2 -> 10
        3 -> 100
        else -> 0
    }
    val cond = Array(M) {0 to '0'}
    repeat(M) {
        val (s, c) = readLine()!!.split(' ').map { it.toInt() }
        cond[it] = s-1 to '0'+c
    }
    fun chk(i: String): Boolean {
        cond.forEach {
            if(i[it.first] != it.second) return false
        }
        return true
    }
    for (i in min .. max) {
        val str = "%0${N}d".format(i)
        if(chk(str)) {
            println(str)
            return
        }
    }
    println(-1)
}
