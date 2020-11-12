package abc.`034`.a

fun main() {
    val (x, y) = readLine()!!.split(' ').map { it.toInt() }

    if (x > y) println("Worse")
    else println("Better")
}
