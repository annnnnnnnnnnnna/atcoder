package abc.`022`.a

fun main() {
    val (n, s, t) = readLine()!!.split(' ').map { it.toInt() }
    var ans = 0
    var w = readLine()!!.toInt()
    repeat(n-1) {
        if (w in s..t) ans++
        w += readLine()!!.toInt()
    }
    if (w in s..t) ans++
    println(ans)
}
