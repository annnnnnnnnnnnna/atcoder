fun main(args: Array<String>) {
    val (a, b, c, k) = readLine()!!.split(' ').map { it.toInt() }
    val (s, t) = readLine()!!.split(' ').map { it.toInt() }
    var ans = 0
    ans += s*a
    ans += t*b
    if (s+t >= k) {
        ans -= (s+t)*c
    }
    println(ans)
}
