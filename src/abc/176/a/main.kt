package abc.`176`.a

fun main(args: Array<String>) {
    val (n, x, t) = readLine()!!.split(' ').map { it.toInt() }
    val kai = n/x + (if (n%x != 0) 1 else 0)
    println(kai*t)
}
