package abc.`152`.c

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val p = readLine()!!.split(' ').map { it.toInt() }

    var ans = 0
    var tmp = Int.MAX_VALUE
    repeat(n) { i ->
        if (tmp > p[i]) {
            ans++
            tmp = p[i]
        }
    }
    println(ans)
}
