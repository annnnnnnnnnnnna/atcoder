fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toInt() }

    var ans = Int.MIN_VALUE
    fun calc(tidx: Int): Int {
        var aMax = Int.MIN_VALUE
        var ret = 0
        for (aidx in a.indices) {
            if (tidx == aidx) continue
            val lst = a.subList(
                Math.max(0, Math.min(tidx, aidx)),
                Math.min(n, Math.max(tidx, aidx)+1)
            )
            var aScore = 0
            var tScore = 0
            for (i in lst.indices) {
                if (i % 2 == 0) {
                    tScore += lst[i]
                } else {
                    aScore += lst[i]
                }
            }
            if (aScore > aMax) {
                aMax = aScore
                ret = tScore
            }
        }
        return ret
    }
    for (i in a.indices) {
        ans = Math.max(ans, calc(i))
    }
    println(ans)
}
