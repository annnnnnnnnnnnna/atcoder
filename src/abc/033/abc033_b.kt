fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var sum = 0
    val lst = Array<Pair<String,Int>>(n) {"" to 0}
    repeat(n) {
        val (s, p) = readLine()!!.split(' ')
        sum += p.toInt()
        lst[it] = s to p.toInt()
    }
    val name = lst.filter { it.second > sum/2 }.firstOrNull()
    println(name?.first ?: "atcoder")
}
