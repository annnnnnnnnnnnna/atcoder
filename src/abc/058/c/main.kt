package abc.`058`.c

import java.io.PrintWriter
import java.lang.StringBuilder
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val n = readLine()!!.toInt()
    val max = IntArray(26)
    val first = readLine()!!
    first.forEach {
        max[it- 'a']++
    }
    repeat(n-1) {
        val count = IntArray(26)
        val S = readLine()!!
        S.forEach {
            count[it- 'a']++
        }
        for (i in 0 until 26) {
            max[i] = min(max[i], count[i])
        }
    }
    val ans = StringBuilder()
    for (i in 0 until 26) {
        ans.append(('a'+i).toString().repeat(max[i]))
    }
    println(ans)
}
