package abc.`161`.d

import java.util.*

fun main(args: Array<String>) {
    val k = readLine()!!.toInt()
    val q = ArrayDeque<Long>()

    repeat(9) { q.add(it+1L) }

    var tmp = 0L
    repeat(k) {
        tmp = q.pollFirst()
        if (tmp % 10L != 0L) {
            q.add(10L * tmp + (tmp % 10L) - 1)
        }
        q.add(10L * tmp + (tmp % 10L))
        if (tmp % 10L != 9L) {
            q.add(10L * tmp + (tmp % 10L) + 1)
        }
    }
    println(tmp)
}
