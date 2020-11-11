fun main(args: Array<String>) {
    val (m, d) = readLine()!!.split(' ').map { it.toInt() }
    if(m%d == 0) println("YES")
    else println("NO")
}
