package abc.`164`.d

fun main(args: Array<String>) {
    val s = readLine()!!
    val p = 2019
    var pow = 1
    var div = 0
    val m = IntArray(p)
    m[0] = 1
    for (i in s.length - 1 downTo 0) {
        val d = s[i] - '0'
        div = (div + pow * d) % p
        pow = (pow * 10) % p
        m[div]++
    }
    var ans = 0
    repeat(p) {
        if (m[it] > 1) {
            ans += m[it] * (m[it] - 1) / 2
        }
    }
    println(ans)
}
