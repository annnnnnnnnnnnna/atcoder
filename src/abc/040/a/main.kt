package abc.`040`.a

fun main() {
    val (n, x) = readLine()!!.split(' ').map { it.toInt() }
    println(Math.min(n-x, x-1))
}
