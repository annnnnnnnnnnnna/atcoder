package abc.`009`.a

fun main() {
    val n = readLine()!!.toInt()
    val ans = n/2
    if (n%2 == 1) println(ans + 1)
    else println(ans)
}
