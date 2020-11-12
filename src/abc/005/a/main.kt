package abc.`005`.a

fun main() {
    val (x, y) = readLine()!!.split(' ').map { it.toInt() }
    println(y/x)
}
