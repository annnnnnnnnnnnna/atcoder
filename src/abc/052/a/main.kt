package abc.`052`.a

fun main() {
    val (a, b, c, d) = readLine()!!.split(' ').map { it.toInt() }
    println(Math.max(a*b, c*d))
}
