fun main(args: Array<String>) {
    val (a, b, c, d) = readLine()!!.split(' ').map { it.toInt() }
    println(Math.max(a*b, c*d))
}
