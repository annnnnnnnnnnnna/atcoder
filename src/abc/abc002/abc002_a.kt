fun main(args: Array<String>) {
    val (x,y ) = readLine()!!.split(' ').map { it.toInt() }
    println(Math.max(x,y))
}
