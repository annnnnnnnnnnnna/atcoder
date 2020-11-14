package abc.`176`.c

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var p = 0
    var ans = 0L
    readLine()!!.split(' ').forEachIndexed { i, v ->
        val a = v.toInt()
        if (i == 0) p = a
        else {
            if (a < p) {
                ans += (p - a)
            } else p = a
        }
    }
    println (ans)
}
