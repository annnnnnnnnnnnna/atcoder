package arc.`110`.a

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = readLine()!!.toInt()
    val fact = IntArray(N+1)
    for (i in 2..N) {
        var n = i
        val s = Math.floor(Math.sqrt(n.toDouble())).toInt()
        var r = 0
        val res = mutableListOf<Pair<Int, Int>>()
        for (j in 2..s) {
            if (n%j == 0) {
                r = 0
                while(n%j == 0) {
                    r++
                    n = n/j
                }
                res.add(j to r)
            }
        }
        if (n > s) res.add(n to 1)
        res.forEach {
            fact[it.first] = max(fact[it.first], it.second)
        }
    }
    var ans = 1L
    for (i in 2..N) {
        for(j in 1 .. fact[i]) {
            ans *= i
        }
    }
    println(ans+1)
}
