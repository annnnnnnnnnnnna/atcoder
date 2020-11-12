package abc.`008`.a

fun main() {
    val (s, t) = readLine()!!.split(' ').map { it.toInt() }
    println(t-s+1)
}
