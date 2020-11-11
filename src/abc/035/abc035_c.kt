fun main(args: Array<String>) {
    val (n, q) = readLine()!!.split(' ').map { it.toInt() }
    val arr = IntArray(n)
    val lsum = IntArray(n)
    val rsum = IntArray(n+1)
    repeat(q) {
        val (l, r) = readLine()!!.split(' ').map { it.toInt() }
        lsum[l-1]++
        rsum[r]++
    }
    var now = 0
    repeat(n) {
        now += lsum[it]
        now -= rsum[it]
        if (now%2 == 0) print(0)
        else print(1)
    }
    println()
}
