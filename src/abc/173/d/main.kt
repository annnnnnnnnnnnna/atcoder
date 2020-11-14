package abc.`173`.d

import java.util.*

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toLong() }.sortedDescending()
    var ans = 0L
    val q = ArrayDeque<Long>()
    q.add(a[0])
    for (i in 1 until n) {
        ans += q.poll()
        q.add(a[i])
        q.add(a[i])
    }
    println(ans)
}
