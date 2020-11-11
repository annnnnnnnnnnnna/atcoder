fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val r = IntArray(n)
    repeat(n) {
        r[it] = readLine()!!.toInt()
    }
    r.sortDescending()
    var paint = true
    var ans = 0.0
    r.forEach {
        val s = Math.PI * it * it
        if (paint) ans += s
        else ans -= s
        paint = !paint
    }
    println(ans)
}
