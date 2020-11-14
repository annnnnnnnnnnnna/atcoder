package abc.`170`.d

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val cnt = IntArray(1000001)
    val a = readLine()!!.split(' ').map {
        val num = it.toInt()
        cnt[num]++
        num
    }.sorted()

    val max= a[a.size-1]
    var ans = n
    for (i in 0 until n) {
        if (cnt[a[i]] > 1) {
            ans -= cnt[a[i]]
        }
        if (cnt[a[i]] >= 1) {
            cnt[a[i]] = 0
            var tmp = a[i] * 2
            if (tmp <= max) {
                while (tmp <= max) {
                    if (cnt[tmp] != 0) {
                        ans -= cnt[tmp]
                        cnt[tmp] = 0
                    }
                    tmp += a[i]
                }
            }
        }
    }
    println(ans)
}
