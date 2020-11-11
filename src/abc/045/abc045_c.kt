fun main(args: Array<String>) {
    val S = readLine()!!
    val max = Math.pow(2.0, (S.length-1).toDouble()).toInt()
    var ans= 0L
    for (i in 0 until max) {
        var pow2 = 1
        var sb = StringBuffer()
        for (j in S.indices) {
            sb.append(S[j])
            if (i and pow2 != 0) {
                ans += sb.toString().toLong()
                sb = StringBuffer()
            }
            pow2 *= 2
        }
        if (sb.isNotEmpty()) {
            ans += sb.toString().toLong()
        }
    }
    println(ans)
}

