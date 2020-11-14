package abc.`179`.e

fun main(args: Array<String>) {
    val (N, X, M) = readLine()!!.split(' ').map { it.toLong() }
    var x = X
    var cnt = 1L
    var ans = 0L
    val f = mutableSetOf<Long>()
    val loopArr = LongArray(M.toInt()+1)
    var loopTop = -1L
    var loopIn = false
    var loopSum = 0L
    var loopLen = 0L

    while(cnt <= N && !loopIn) {
        val next = x*x
        if (f.contains(x)) {
            loopIn = true
            loopTop = x
            loopArr[loopLen.toInt()] = x
            loopSum += x
            loopLen++
        }
        f.add(x)
        ans += x
        x = next % M
        cnt++
    }
    if (x == 0L) {
        println(ans)
        return
    }

    while (cnt <= N && x != loopTop) {
        ans += x
        loopArr[loopLen.toInt()] = x
        loopSum += x
        loopLen++
        x = (x * x) % M
        cnt++
    }
    if (loopLen > 0) {
        val loops = (N - cnt) / loopLen
        ans += loopSum * loops
        cnt += loopLen * loops

        var cnt2 = 0
        while (cnt <= N) {
            ans += loopArr[cnt2]
            cnt++
            cnt2++
        }
    }

    println(ans)
}
