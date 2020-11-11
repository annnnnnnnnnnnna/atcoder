package abc.`148`.d

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toInt() }
    var i = 1
    var ans = 0
    repeat(n) {
        if (a[it] != i) ans++
        else i++
    }
    if (ans == n) println(-1)
    else println(ans)
}
