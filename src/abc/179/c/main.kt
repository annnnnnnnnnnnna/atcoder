package abc.`179`.c

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    var n = 1
    val arr = IntArray(N) {1}
    arr[0] = 0
    while(n <= N-1) {
        var t = n + n
        val max = N - 1
        while (t <= max) {
            arr[t] += 1
            t += n
        }
        n++
    }
    println(arr.sum())
}
