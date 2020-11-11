fun main(args: Array<String>) {
    var ans = 0
    repeat(12) {
        val s = readLine()!!
        if(s.count { it == 'r' } > 0) ans++
    }
    println(ans)
}
