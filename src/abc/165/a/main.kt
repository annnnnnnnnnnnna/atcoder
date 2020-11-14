package abc.`165`.a

fun main(args: Array<String>) {
    val k = readLine()!!.toInt()
    val (a, b) = readLine()!!.split(' ').map { it.toInt() }

    var ans = false
    for (i in a .. b) {
        if (i%k == 0) ans = true
    }

    if (ans) println("OK")
    else println("NG")
}
