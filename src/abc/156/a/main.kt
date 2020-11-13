package abc.`156`.a

fun main(args: Array<String>) {
    val (n, r) = readLine()!!.split(' ').map { it.toInt() }

    if (n >= 10) {
        println(r)
    } else {
        println(r + (100 * (10 - n)))
    }
}
