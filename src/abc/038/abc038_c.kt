fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toInt() }
    var cnt = 1L
    var ans = 1L
    var pre = a[0]
    var i = 1
    while (i < n) {
        while (i < n && pre < a[i]) {
            cnt++
            ans += cnt
            pre = a[i]
            i++
        }
        cnt = 1
        if (i < n) {
            ans++
            pre = a[i]
            i++
        }
    }
    println(ans)
}
