package abc.`183`.c

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (N, K) = readLine()!!.split(' ').map { it.toInt() }
    val times =  (1..N).map{ readLine()!!.split(' ').map { it.toInt() } }

    // 順列の全列挙と条件に合うかのチェック
    var ans = 0
    val plan = IntArray(N+1)
    fun check () {
        var tmp = 0
        for (i in 1 .. N) {
            tmp += times[plan[i-1]][plan[i]]
        }
        if (tmp == K) ans++
    }
    fun permutation(lst: List<Int>, d: Int) {
        lst.forEach {
            plan[d] = it
            if (d+1 == N) {
                check()
            } else {
                permutation(lst.minus(it), d+1)
            }
        }
    }
    permutation((1 until N).toList(), 1)

    println(ans)
}
