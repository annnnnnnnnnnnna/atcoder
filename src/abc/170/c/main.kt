package abc.`170`.c

fun main(args: Array<String>) {
    val (x, n) = readLine()!!.split(' ').map { it.toInt() }
    val p = if (n > 0) readLine()!!.split(' ').map { it.toInt() } else listOf<Int>()

    val notinc = BooleanArray(102) {true}
    repeat(n) {
        notinc[p[it]] = false
    }
    var min = Int.MAX_VALUE
    var ans = Int.MAX_VALUE
    for (i in 0 until 102) {
        if (notinc[i]) {
            val d = Math.abs(x - i)
            if (d < min) {
                ans = i
            }
            min = Math.min(d, min)
        }
    }
    println(ans)
}
