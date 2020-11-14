package abc.`177`.a

fun main(args: Array<String>) {
    val (d, t,s) = readLine()!!.split(' ').map { it.toInt() }
    if (t*s >= d) println("Yes")
    else println("No")
}
