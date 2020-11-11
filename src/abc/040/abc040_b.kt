fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val max = Math.sqrt(n.toDouble()).toInt()
    var ans = Int.MAX_VALUE
    for (i in 1..max) {
        val j = n/i
        val k = n%i
        ans = Math.min(ans, Math.abs(i-j)+k)
    }
    println(ans)
}
