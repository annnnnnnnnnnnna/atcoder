fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val r = readLine()!!.split(' ').map { it.toDouble() }
    var ans = 0.0
    val watch = r.sortedDescending().take(k).reversed().forEach {
        ans = (ans + it)/2.0
    }
    println(ans)
}
