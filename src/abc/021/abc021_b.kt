fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val (a, b) = readLine()!!.split(' ').map { it.toInt() }
    val k = readLine()!!.toInt()
    val p = readLine()!!.split(' ').map { it.toInt() }
    if (a in p || b in p || p.toSet().size != p.size) {
        println ("NO")
    } else {
        println("YES")
    }
}
