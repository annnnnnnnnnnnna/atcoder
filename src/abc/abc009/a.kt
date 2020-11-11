fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val ans = n/2
    if (n%2 == 1) println(ans + 1)
    else println(ans)
}
