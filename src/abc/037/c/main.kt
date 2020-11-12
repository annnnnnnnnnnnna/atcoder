package abc.`037`.c

fun main() {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val arr = Array(n-k+1) { 0L }
    val a = readLine()!!.split(' ').map { it.toInt() }

    var sum= 0L
    a.forEachIndexed { idx, num ->
        sum += num
        if (idx > k-1) {
            sum -= a[idx-k]
        }
        if (idx >= k-1) {
            arr[idx-k+1] = sum
        }
    }
    var ans = 0L
    arr.forEach {
        ans += it
    }
    println(ans)
}
