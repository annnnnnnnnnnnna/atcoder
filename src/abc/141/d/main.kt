package abc.`141`.d

import java.util.*

fun main() {
    var (N, M) = readLine()!!.split(' ').map { it.toInt() }
    val A = readLine()!!.split(' ').map { it.toInt() }

    val q = PriorityQueue<Int>(Collections.reverseOrder())
    q.addAll(A)

    repeat(M) {
        val d = q.poll()
        q.add(d/2)
    }
    var plice = 0L
    q.forEach {
        plice += it
    }
    println(plice)
}
