package abc.`148`.e

fun main(args: Array<String>) {
    val n = readLine()!!.toLong()
    if (n%2L == 1L) {
        println(0)
        return
    }

    var powFive = 5L
    var res = 0L
    var ans = 0L
    do {
        res = n / (powFive * 2)
        ans += res
        powFive *= 5L
    } while (res != 0L)

    println(ans)
}
