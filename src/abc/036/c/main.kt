package abc.`036`.c

fun main() {
    val n = readLine()!!.toInt()
    val a = (1..n).map { readLine()!!.toInt() }
    val s = a.asSequence().toSet().toList().sorted().withIndex().associateBy({it.value}, {it.index})

    a.forEach {
        println(s[it])
    }
}
