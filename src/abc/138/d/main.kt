package abc.`138`.d

import java.io.PrintWriter
import java.util.ArrayDeque
import kotlin.math.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (N, Q) = readLine()!!.split(' ').map { it.toInt() }

    val tree = Array(N) { mutableSetOf<Int>() }
    for (i in 1 until N) {
        val (a, b) = readLine()!!.split(' ').map { it.toInt()-1 }
        tree[a].add(b)
        tree[b].add(a)
    }
    val pointAdd = IntArray(N)
    for (i in 1 .. Q) {
        val (p, x) = readLine()!!.split(' ').map { it.toInt() }
        pointAdd[p-1] += x
    }
    val queue = ArrayDeque<Int>()
    val visited = BooleanArray(N)
    queue.add(0)
    visited[0] = true
    while(queue.isNotEmpty()) {
        val i = queue.pollFirst()
        tree[i].forEach {
            if (!visited[it]) {
                pointAdd[it] += pointAdd[i]
                queue.add(it)
                visited[it] = true
            }
        }
    }

    println(pointAdd.joinToString(" "))
}
