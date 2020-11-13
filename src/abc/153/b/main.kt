package abc.`153`.b

fun main(args: Array<String>) {
    val (h, n) = readLine()!!.split(' ')
    val a = readLine()!!.split(' ').map { it.toInt() }

    var atk = 0L
    for (i in 0 until n.toInt()) {
        atk += a[i]
    }

    if (h.toLong() > atk) println("No")
    else println("Yes")
}
