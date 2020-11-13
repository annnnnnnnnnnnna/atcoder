package abc.`159`.a

fun main(args: Array<String>) {

    val (n, m) = readLine()!!.split(' ').map { it.toInt() }

    var ans = 0

    if (n >= 2) {
        ans += nCr(n,2)
    }
    if (m >= 2) {
        ans += nCr(m,2)
    }
    println(ans)
}

fun nCr(n: Int, r: Int):Int {
    var ans = 1
    var bunbo = 1
    val limit = Math.min(r, n-r)
    for (i in 0 until limit) {
        ans *= (n - i)
        bunbo *= (i+1)
    }
    return ans / bunbo
}
