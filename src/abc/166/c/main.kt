package abc.`166`.c

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }
    val h = readLine()!!.split(' ').map { it.toInt() }

    val noRoot = BooleanArray(n){true}
    val highest = BooleanArray(n){true}

    repeat(m) {
        val (a, b) = readLine()!!.split(' ').map { it.toInt() }
        noRoot[a-1] = false
        noRoot[b-1] = false
        if (h[a-1] <= h[b-1]) highest[a-1] = false
        if (h[a-1] >= h[b-1]) highest[b-1] = false
    }
    var ans = 0
    repeat(n) {
        if (noRoot[it] || highest[it]) ans++
    }
    println(ans)

}
