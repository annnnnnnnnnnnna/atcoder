package abc.`151`.c

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }
    val status = BooleanArray(n){false}
    val wa = IntArray(n){0}
    var ac = 0L
    repeat(m) {
        val (p, s) = readLine()!!.split(' ')
        if (!status[p.toInt()-1]) {
            when(s) {
                "AC" -> {
                    status[p.toInt()-1] = true
                    ac++
                }
                "WA" -> wa[p.toInt()-1]++
            }
        }
    }
    var waTotal = 0L
    repeat(n) {
        if (status[it]) waTotal += wa[it]
    }
    println("$ac $waTotal")
}
