fun main(args: Array<String>) {
    val (a, b, c) = readLine()!!.split(' ').map { it.toInt() }
    println(c/Math.min(a,b))
}
