package abc.`158`.e

fun main(args: Array<String>) {
    val (n, p) = readLine()!!.split(' ').map { it.toInt() }
    val s = readLine()!!
    var ans = 0L
    when(p) {
        2,5 -> {
            for (i in s.indices) {
                val d = s[i] - '0'
                if (d % p == 0) {
                    ans += i + 1
                }
            }
        }
        else -> {
            var pow = 1
            var div = 0
            val m = LongArray(p)
            m[0] = 1
            for (i in s.length - 1 downTo 0) {
                val d = s[i] - '0'
                div = (div + pow * d) % p
                pow = (pow * 10) % p
                m[div]++
            }
            repeat(p) {
                if (m[it] > 1) {
                    ans += m[it] * (m[it] - 1) / 2
                }
            }
        }
    }
    println(ans)
}
