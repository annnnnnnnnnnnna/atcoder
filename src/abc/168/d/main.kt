package abc.`168`.d

import java.util.*

import java.io.PrintWriter

@JvmField val _writer = PrintWriter(System.out, false)
fun main(args: Array<String>) { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }

    val guide = IntArray(n+1) { Int.MAX_VALUE }
    val visited = BooleanArray(n+1) { false }
    guide[0] = 0
    visited[0] = true
    guide[1] = 0
    visited[1] = true
    val ab = Array(n+1){ mutableSetOf<Int>() }
    repeat(m) {
        val route = readLine()!!.split(' ').map { it.toInt() }
        ab[route[0]].add(route[1])
        ab[route[1]].add(route[0])
    }

    val q = ArrayDeque<Int>()
    q.add(1)
    fun check() {
        while(q.isNotEmpty()) {
            val pos = q.pollFirst()
            ab[pos].forEach {
                if (!visited[it]) {
                    guide[it] = pos
                    q.add(it)
                    visited[it] = true
                }
            }
        }
    }
    check()

  println("Yes")
  for (i in 2..n) {
    println(guide[i])
  }
}
