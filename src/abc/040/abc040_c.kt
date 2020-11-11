fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toInt() }
    if (N == 2) {
        println(Math.abs(a[1] - a[0]))
        return
    }

    val dp = Array(N) {Int.MAX_VALUE}
    dp[0] = 0
    dp[1] = Math.abs(a[1] - a[0])
    var i = 2
    while (i < N) {
        val pp = dp[i-2] + Math.abs(a[i] - a[i-2])
        val p = dp[i-1] + Math.abs(a[i] - a[i-1])
        dp[i] = Math.min(pp, p)
        i++
    }
    println(dp.last())
}
