package abc.`149`.d

import java.io.PrintWriter

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val (s, p, r) = readLine()!!.split(' ').map { it.toInt() }
    val t = readLine()!!
    val l = Math.ceil(n.toDouble()/k.toDouble()).toInt()
    val arr = Array(k) {CharArray(l)}
    var ans = 0L
    repeat(k) {i ->
        var prev = '0'
        repeat(l) { j ->
            if (i + j*k < n) {
                val now = t[i + j * k]
                arr[i][j] = now
                if (now != prev) {
                    when (now) {
                        'r' -> ans += r
                        's' -> ans += s
                        'p' -> ans += p
                    }
                    prev = now
                } else {
                    prev = '0'
                }
            }
        }
    }
    println(ans)
}
