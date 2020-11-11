fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    if (n%2 == 0) {
        println(-1)
        return
    }
    if (n == 1) {
        if (s == "b") println(0)
        else println(-1)
        return
    }

    val num = n/2
    var acc = "b"
    for (i in 1 .. num) {
        when (i%3) {
            1 -> acc = "a${acc}c"
            2 -> acc = "c${acc}a"
            0 -> acc = "b${acc}b"
        }
    }
    if (acc == s) println(num)
    else println(-1)
}
