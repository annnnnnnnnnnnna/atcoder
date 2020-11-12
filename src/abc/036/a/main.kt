package abc.`036`.a

fun main() {
    val (a, b) = readLine()!!.split(' ').map { it.toInt() }
    println(
        if (b % a == 0) b/a
        else b/a + 1
    )
}
