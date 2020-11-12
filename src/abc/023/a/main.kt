package abc.`023`.a

fun main() {
    val x = readLine()!!
    var ans = 0
    for (i in x.indices) {
        ans += x[i].toString().toInt()
    }
    println(ans)
}
