package abc.`150`.a

fun main(args: Array<String>) {
    val (k, x) = readLine()!!.split(' ').map { it.toInt() }
    if (k*500>=x) println("Yes")
    else println("No")
}
