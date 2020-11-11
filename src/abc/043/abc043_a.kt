fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var ans = 0
    for (i in 1..n) {
        ans += i
    }
    println(ans)
}

