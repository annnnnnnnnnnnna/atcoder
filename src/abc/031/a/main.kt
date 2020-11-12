package abc.`031`.a

fun main() {
    val (a, d) = readLine()!!.split(' ').map { it.toInt() }
    println((Math.min(a, d) + 1) * Math.max(a,d))
}
