package abc.`175`.c

fun main(args: Array<String>) {
    val (x, k, d) = readLine()!!.split(' ').map { it.toLong() }

    var now = Math.abs(x)
    val first = now/d
    if (first >= k) {
        now -= k * d
    } else {
        now -= first * d
        val zan = k-first
        if (zan%2L == 1L) {
            now -= d
        }
    }
    println(Math.abs(now))
}
