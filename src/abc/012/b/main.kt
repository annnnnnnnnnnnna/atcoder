package abc.`012`.b

fun main() {
    var n = readLine()!!.toInt()
    val s = n%60
    n -= s
    n /= 60
    val m = n%60
    n -= m
    n /= 60

    println("${"%02d".format(n)}:${"%02d".format(m)}:${"%02d".format(s)}")
}
