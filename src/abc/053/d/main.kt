package abc.`053`.d

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = readLine()!!.toInt()
    val mp = mutableMapOf<Int, Int>()
    readLine()!!.split(' ').forEach {
        val a = it.toInt()
        if (mp[a] == null) mp[a] = 0
        mp[a] = mp[a]!! + 1
    }
    val dup = mp.filter { it.value >= 2 }.values.sumBy { it-1 }
    println(
        if (dup % 2 == 0) mp.keys.size
        else mp.keys.size - 1
    )
}
