package abc.`084`.d

import java.io.PrintWriter
import java.util.*
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val Q = nextInt()
    var max = 0
    val lr = (1..Q).map {
        val l = nextInt()
        val r = nextInt()
        max = max(r,max)
        l to r
    }

    val prime = BooleanArray(max+1) { true }
    prime[0] = false
    prime[1] = false
    for (i in 2 .. max) {
        var r = i + i
        while(r <= max) {
            prime[r] = false
            r+=i
        }
    }

    val ruisekiwa = IntArray(max+1)
    var i = 3
    while(i <= max) {
        if (prime[i] && prime[(i+1)/2]) {
            ruisekiwa[i] = ruisekiwa[i-2] + 1
        } else {
            ruisekiwa[i] = ruisekiwa[i-2]
        }
        i += 2
    }
    lr.forEach {
        println(ruisekiwa[it.second] - ruisekiwa.getOrElse(it.first-2){0})
    }
}
private var st = StringTokenizer("")
private val br = System.`in`.bufferedReader()

fun next(): String {
    while (!st.hasMoreTokens()) st = StringTokenizer(br.readLine())
    return st.nextToken()
}
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun nextLine() = br.readLine()
fun nextDouble() = next().toDouble()
