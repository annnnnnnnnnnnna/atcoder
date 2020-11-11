package abc.`130`.d

fun main(args: Array<String>) {
    val (N, K) = readLine()!!.split(' ').map { it.toLong() }
    val a = readLine()!!.split(' ').map { it.toInt() }

    var ans = 0L
    var j = 0
    var sum = 0L
    for (i in 0 until N.toInt()) {
        while (sum < K && j < N) {
            sum += a[j]
            j++
        }
        if (sum >= K) {
            ans += N - j + 1L
        }
        sum -= a[i]
    }
    println(ans)
}
