package abc.`160`.d

fun main(args: Array<String>) {
    val (n, x, y) = readLine()!!.split(' ').map { it.toInt() }

    val ans = IntArray(n)
    for (i in 1..n-1) {
        for (j in i+1..n) {
            val a = j-i
            val b = Math.abs(x-i) + Math.abs(y-j) + 1
            val c = Math.abs(x-j) + Math.abs(y-i) + 1
            val min = Math.min(a, Math.min(b, c))
            ans[min]++
        }
    }
    for (i in 1 until n) {
        println(ans[i])
    }
}
