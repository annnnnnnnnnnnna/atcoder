package abc.`172`.d

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    var ans = 1L
    val baisuu = LongArray(n+1) { 1L }
    for (i in 2..n) {
        var j = i
        while(j <= n) {
            baisuu[j]++
            j += i
        }
        ans += i * baisuu[i]
    }
    println(ans)
}
