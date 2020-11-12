package abc.`019`.a

fun main() {
    val a = readLine()!!.split(' ').map { it.toInt() }.sorted()
    println(a[1])
}
