package abc.`174`.b

fun main(args: Array<String>) {
    val (n, d) = readLine()!!.split(' ').map { it.toInt() }
    var ans = 0
    repeat(n) {
        val (x, y) = readLine()!!.split(' ').map { it.toDouble() }
        if ( Math.sqrt(x*x + y*y) <= d.toDouble() ) ans++
    }
    println(ans)

}
