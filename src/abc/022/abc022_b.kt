fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var ans = 0
    var have = mutableSetOf<Int>()
    repeat(n) {
        val a = readLine()!!.toInt()
        if (a in have) ans++
        have.add(a)
    }
    println(ans)
}
