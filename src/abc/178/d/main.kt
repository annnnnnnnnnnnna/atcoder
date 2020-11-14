package abc.`178`.d

import java.io.PrintWriter

@JvmField val _writer = PrintWriter(System.out, false)
fun main(args: Array<String>) { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val s = readLine()!!.toInt()

    val ans = IntArray(2001) { -1 }
    ans[0] = 0
    ans[1] = 0
    ans[2] = 0
    ans[3] = 1
    ans[4] = 1
    ans[5] = 1
    fun f(n: Int): Int {
        if (ans[n] != -1) return ans[n]
        val n1 = if(ans[n-1] != -1) ans[n-1] else f(n-1)
        val n3 = if(ans[n-3] != -1) ans[n-3] else f(n-3)
        ans[n] = modAdd(n1, n3)
        return ans[n]
    }
    f(s)
    println(ans[s])
}


const val mod = 1000000007
fun modAdd(a: Int, b:Int):Int = (a + b) % mod
