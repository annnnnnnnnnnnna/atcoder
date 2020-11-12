package abc.`039`.a

fun main() {
    val (a, b, c) = readLine()!!.split(' ').map { it.toInt() }
    val ans = a*b*2 + a*c*2 + b*c*2
    println(ans)
}
