package abc.`177`.c

fun main(args: Array<String>) {
    val mod = 1000000007L

    val n = readLine()!!.toInt()
    var sum = 0L
    val a = readLine()!!.split(' ').map {
        val num = it.toLong()
        sum = (sum + num) % mod
        num
    }

    var ans = 0L
    for (i in 0 until n) {
        sum = (sum - a[i]) % mod
        if(sum < 0) sum += mod
        ans += (a[i]*sum) %mod
        ans %= mod
    }
    println(ans)
}
