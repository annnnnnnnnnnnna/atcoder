fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(' ').map { it.toInt() }

    if (x > y) println("Worse")
    else println("Better")
}
