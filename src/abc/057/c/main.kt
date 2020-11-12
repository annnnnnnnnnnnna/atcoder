package abc.`057`.c

fun main() {
    val n = readLine()!!.toLong()

    val s = Math.floor(Math.sqrt(n.toDouble())).toLong()
    var ans = Int.MAX_VALUE
    for (a in 1..s) {
        if (n%a == 0L) {
            val b = n / a
            ans = Math.min(ans, Math.max(a.toString().length, b.toString().length))
        }
    }
    println(ans)
}
