package abc.`146`.c

fun main() {
    val (a, b, x) = readLine()!!.split(' ').map { it.toLong() }

    fun chk(num: Long): Boolean {
        return x >= a * num + b * num.toString().length
    }

    var ng = 1000000001L
    var ok = 0L
    while (Math.abs(ok-ng) > 1L) {
        val m = (ok+ng)/2L
        if (chk(m)) {
            ok = m
        } else {
            ng = m
        }
    }

    println(ok)
}
