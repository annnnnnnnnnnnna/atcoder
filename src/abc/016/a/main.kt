package abc.`016`.a

fun main() {
    val (m, d) = readLine()!!.split(' ').map { it.toInt() }
    if(m%d == 0) println("YES")
    else println("NO")
}
