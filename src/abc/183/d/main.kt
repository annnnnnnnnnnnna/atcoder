package abc.`183`.d

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (N, W) = readLine()!!.split(' ').map { it.toInt() }
    val need = LongArray(200001)
    repeat(N){
        val (S, T, P) = readLine()!!.split(' ').map { it.toInt() }
        need[S] += P.toLong()
        need[T] -= P.toLong()
    }
    val cusum = LongArray(N+1) //累積和
    for (i in 0 .. N) {
        cusum[i] = (cusum.getOrElse(i-1){0}) + need.getOrElse(i-1){0}
        if (cusum[i] > W) {
            println("No")
            return
        }
    }
    println("Yes")
}
