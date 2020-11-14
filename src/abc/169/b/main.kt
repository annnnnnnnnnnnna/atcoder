package abc.`169`.b

import java.math.BigDecimal

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var zero = false
    val a = readLine()!!.split(' ').map {
        val aa = it.toLong()
        if (aa == 0L) zero = true
        BigDecimal(aa)
    }
    val max = BigDecimal("1000000000000000000")
    if (!zero) {
        var ans = BigDecimal.ONE
        var i = 0
        while (i < n && ans <= max) {
            ans *= a[i]
            i++
        }
        if (ans > max) println(-1)
        else println(ans)
    } else {
        println(0)
    }
}
