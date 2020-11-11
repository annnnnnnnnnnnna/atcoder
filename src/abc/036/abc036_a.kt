fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map { it.toInt() }
    println(
        if (b % a == 0) b/a
        else b/a + 1
    )
}
