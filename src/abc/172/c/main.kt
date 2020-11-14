package abc.`172`.c

fun main(args: Array<String>) {
    val (n, m, k) = readLine()!!.split(' ').map { it.toInt() }
    val a = readLine()!!.split(' ').map { it.toLong() }
    var bSum = 0L
    val b = arrayOf(0L) + readLine()!!.split(' ').map {
        bSum += it.toLong()
        bSum
    }

    var answer = 0

    var aTime = 0L
    for (i in 0..n) {
        if (i > 0) {
            aTime += a[i-1]
        }
        if (aTime > k) break

        var ng = m+1
        var ok = 0
        while (Math.abs(ok-ng) > 1L) {
            val mid = (ok+ng)/2
            if (aTime + b[mid] <= k) {
                ok = mid
            } else {
                ng = mid
            }
        }
        answer = Math.max(answer, i + ok)
    }
    println(answer)
}
