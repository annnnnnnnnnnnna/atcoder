fun main(args: Array<String>) {
    val (n, t) = readLine()!!.split(' ').map { it.toInt() }
    var ans = 0
    var pre = Int.MIN_VALUE
    repeat(n) {
        val a = readLine()!!.toInt()
        ans += t
        if (pre+t > a) {
            ans -= t - (a - pre)
        }
        pre = a
    }
    println(ans)
}
