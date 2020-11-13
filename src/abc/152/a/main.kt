package abc.`152`.a

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }
    if (n <= m) println("Yes")
    else println("No")
}
