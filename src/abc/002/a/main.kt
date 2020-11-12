package abc.`002`.a

fun main() {
    val (x,y ) = readLine()!!.split(' ').map { it.toInt() }
    println(Math.max(x,y))
}
