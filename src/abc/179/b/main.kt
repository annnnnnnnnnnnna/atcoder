package abc.`179`.b

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var ans = false
    var cnt = 0
    repeat(n) {
        val (d1, d2) = readLine()!!.split(' ').map { it.toInt() }
        if (d1 == d2) cnt++
        else cnt = 0
        ans = ans || cnt == 3
    }
    if (ans) println("Yes")
    else println("No")
}
