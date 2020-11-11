package abc.`122`.c

fun main(args: Array<String>) {
    val (n, q) = readLine()!!.split(' ').map { it.toInt() }

    val s = readLine()!!
    val p = IntArray(n)
    var cnt = 0
    p[0] = 0
    for (i in 1 until n) {
        if (s[i-1] == 'A' && s[i] == 'C') cnt++
        p[i] = cnt
    }

    repeat(q) {
        val (l, r) = readLine()!!.split(' ').map { it.toInt()-1 }
        println(p[r] - p[l])
    }

}
