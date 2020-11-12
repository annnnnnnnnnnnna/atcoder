package abc.`037`.a

fun main() {
    val (a, b, c) = readLine()!!.split(' ').map { it.toInt() }
    println(c/Math.min(a,b))
}
