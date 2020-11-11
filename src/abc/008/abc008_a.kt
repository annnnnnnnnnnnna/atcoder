fun main(args: Array<String>) {
    val (s, t) = readLine()!!.split(' ').map { it.toInt() }
    println(t-s+1)
}
