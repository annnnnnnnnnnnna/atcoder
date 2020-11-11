fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val ng1 = readLine()!!.toInt()
    val ng2 = readLine()!!.toInt()
    val ng3 = readLine()!!.toInt()
    val ngs = listOf(ng1, ng2, ng3)
    if (n == ng1 || n == ng2 || n == ng3) {
        println("NO")
        return
    }
    val ngMin = Math.min(n, Math.min(ng1, Math.min(ng2, ng3)))
    val ngMax = Math.min(n, Math.max(ng1, Math.max(ng2, ng3)))
    if (ngMax != n && ngMin != n && ngMax - ngMin <= 2) {
        println("NO")
        return
    }
    if (n >= 300) {
        if (ng1%3 == 0 || ng2%3 == 0 || ng3%3 == 0) {
            println("NO")
            return
        }
    }
    var now = n
    var cnt = 0
    while (now > 0) {
        now -=3
        while (now in ngs) {
            now++
        }
        cnt++
    }
    if (cnt <= 100) println("YES")
    else println("NO")
}
