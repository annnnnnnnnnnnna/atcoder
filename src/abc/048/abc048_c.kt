fun main(args: Array<String>) {
    val (N, x) = readLine()!!.split(' ').map { it.toInt() }
    val a = readLine()!!.split(' ').map { it.toLong() }.toLongArray()
    var now = a[0]
    var ans = 0L
    for (i in 1 until N) {
        now += a[i]
        val d = now - x
        if (d > 0) {
            now -= d
            if (d <= a[i]) {
                a[i] -= d
            } else {
                a[i-1] -= d - a[i]
                a[i] = 0
            }
            ans += d
        }
        now -= a.getOrElse(i-1) {0}
    }
    println(ans)
}
