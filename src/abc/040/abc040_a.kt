fun main(args: Array<String>) {
    val (n, x) = readLine()!!.split(' ').map { it.toInt() }
    println(Math.min(n-x, x-1))
}
