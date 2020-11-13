package abc.`153`.c

fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val h = readLine()!!.split(' ').map { it.toInt() }

    var used = k
    var att = 0L
    h.sortedDescending().forEach {
        if (used > 0) used--
        else att += it
    }

    println(att)
}
