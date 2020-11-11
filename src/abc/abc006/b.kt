fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val mod = 10007
    var ppp = 0
    var pp = 0
    var p = 1
    if (n < 3) {
        println(0)
        return
    } else if (n == 3) {
        println(1)
        return
    }
    for (i in 4..n) {
        val new = ppp + pp + p
        ppp = pp
        pp = p
        p = new % mod
    }
    println(p)
}
