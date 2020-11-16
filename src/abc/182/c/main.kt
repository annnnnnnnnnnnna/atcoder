package abc.`182`.c

import java.io.PrintWriter
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = readLine()!!.toCharArray()
    var sum = 0
    N.forEach {
        sum += it - '0'
    }
    val d = sum % 3
    when (d) {
        0 -> {
            println(0)
            return
        }
        1 -> {
            if ('1' in N || '4' in N || '7' in N) {
                if (N.size > 1) {
                    println(1)
                } else {
                    println(-1)
                }
                return
            }
            if (N.count { it == '2' || it == '5' || it == '8' } >= 2) {
                if (N.size > 2) {
                    println(2)
                } else {
                    println(-1)
                }
                return
            }
        }
        2 -> {
            if ('2' in N || '5' in N || '8' in N) {
                if (N.size > 1) {
                    println(1)
                } else {
                    println(-1)
                }
                return
            }
            if (N.count { it == '1' || it == '4' || it == '7' } >= 2) {
                if (N.size > 2) {
                    println(2)
                } else {
                    println(-1)
                }
                return
            }
        }
    }
}
