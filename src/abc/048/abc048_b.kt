fun main(args: Array<String>) {
    val (a, b, x) = readLine()!!.split(' ').map { it.toLong() }
    fun f(a:Long): Long {
        if (a == -1L) return 0L
        return a/x+1L
    }
    println(f(b) - f(a-1))
}

