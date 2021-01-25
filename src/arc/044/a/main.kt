package arc.`044`.a

import java.io.PrintWriter
import java.util.*
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = nextLine()
    val max = sqrt(N.toDouble()).toInt()
    var r = 2
    var prime = true
    val n = N.toInt()
    if (n == 1) {
        println("Not Prime")
        return
    }
    while(r <= max && prime) {
        if (n%r == 0) {
            prime = false
        }
        r++
    }
    var nearPrime = true
    if (!prime) {
        val sum = N.toCharArray().sumBy { it - '0' }
        if (sum % 3 == 0) nearPrime = false
        if (N.last() == '5') nearPrime = false
        if (n%2 == 0) nearPrime = false
    }
    if (prime || nearPrime) println("Prime")
    else println("Not Prime")
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
