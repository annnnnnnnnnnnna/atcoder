fun main(args: Array<String>) {
    val (a, b, c) = readLine()!!.split(' ').map { it.toInt() }

    if (a+b == c || a+c == b || b+c == a) println("Yes")
    else println("No")
}
