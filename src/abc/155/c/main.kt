package abc.`155`.c

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main(args: Array<String>) { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = readLine()!!.toInt()
    val mp = mutableMapOf<String, Int>()
    var max = 0
    repeat(N) {
        val S = readLine()!!
        if (mp[S] == null) mp[S] = 0
        mp[S] = mp[S]!! + 1
        max = max(max, mp[S]!!)
    }
    mp.filter{ it.value == max}.keys.toList().sorted().forEach {
        println(it)
    }
}
