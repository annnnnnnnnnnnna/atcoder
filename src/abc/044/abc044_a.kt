fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val k = readLine()!!.toInt()
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()
    var ans = Math.min(k, n) * x
    if (k < n) ans += (n-k)*y
    println(ans)
}

