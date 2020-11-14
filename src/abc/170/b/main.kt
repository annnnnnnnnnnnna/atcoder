package abc.`170`.b

fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(' ').map { it.toInt() }
    if (y == 2*x || y == 4*x) {
        println("Yes")
        return
    } else if (y % 2 == 1 || y > 4*x || y < 2*x) {
        println("No")
        return
    }

    var ashi = 4 * x
    var change = x
    while (ashi != y) {
        ashi -=2
        change--
    }
    if (ashi == y) println("Yes")
    else println("No")
}
