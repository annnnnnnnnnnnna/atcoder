fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val s = Array(n) {0L}
    var ans = 0
    var streak = 0
    var mul = 1L
    repeat(n) {
        s[it] = readLine()!!.toLong()
        mul *= s[it]
        streak++
        if (mul > k) {
            while (mul > k && streak > 0) {
                streak--
                mul /= s[it-streak]
            }
        }
        ans = Math.max(ans, streak)
    }
    if (0 in s) println(n)
    else println(ans)
}
