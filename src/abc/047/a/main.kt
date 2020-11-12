package abc.`047`.a

fun main() {
    val (a, b, c) = readLine()!!.split(' ').map { it.toInt() }

    if (a+b == c || a+c == b || b+c == a) println("Yes")
    else println("No")
}
