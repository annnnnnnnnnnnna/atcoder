package abc.`152`.d

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    val cnt = Array(10) {IntArray(10){0} }
    for (i in 1..n) {
        val first = i.toString().first().toString().toInt()
        val last = i.toString().last().toString().toInt()
        cnt[first][last]++
    }
    var ans = 0
    for (i in 1..n) {
        val first = i.toString().first().toString().toInt()
        val last = i.toString().last().toString().toInt()
        ans += cnt[last][first]
    }
    println(ans)
}
