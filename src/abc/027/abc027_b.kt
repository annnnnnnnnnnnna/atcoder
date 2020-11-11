fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var sum = 0
    val a = readLine()!!.split(' ').map {
        val num = it.toInt()
        sum += num
        num
    }
    if (sum%n != 0) {
        println(-1)
        return
    }
    var same = true
    var pre = a[0]
    val l = IntArray(n) {0}
    val r = IntArray(n) {0}
    l[0] = a[0]
    r[0] = sum-a[0]
    for (i in 1 until n) {
        if(a[i] != pre) same = false
        pre = a[i]
        l[i] = l[i-1] + a[i]
        r[i] = sum - l[i]
    }
    if (same) {
        println(0)
        return
    }
    val num = sum/n
    var ans = 0
    var i = 0
    while (i < n) {
        if(!(l[i] == num*(i+1) && r[i] == num*(n-i-1))) {
            ans++
        }
        i++
    }
    println(ans)
}
