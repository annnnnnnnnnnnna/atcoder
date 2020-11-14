package abc.`161`.c

fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toLong() }

    val x = n % k
    var sub = x - k
    sub = if (sub < 0) sub * -1
    else sub
    if (sub < x) println(sub)
    else println(x)
}
