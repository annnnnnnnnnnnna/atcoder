package abc.`169`.d

fun main(args: Array<String>) {
    var n = readLine()!!.toLong()

    var s = Math.floor(Math.sqrt(n.toDouble())).toLong()
    var r = 0L
    var res = mutableListOf<Pair<Long,Long>>()
    for (i in 2..s) {
        if (n%i == 0L) {
            r = 0L
            while(n%i == 0L) {
                r++
                n = n/i
            }
            res.add(i to r)
        }
    }
    if (n > s) res.add(n to 1)

    var ans = 0
    res.forEach {
        var r = it.second
        var cnt = 1
        while (r >= cnt) {
            r -= cnt
            ans++
            cnt++
        }
    }
    println(ans)
}
