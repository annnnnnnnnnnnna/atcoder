package abc.`178`.b

fun main(args: Array<String>) {
    val (a, b, c, d) = readLine()!!.split(' ').map { it.toLong() }

    var ans = b*c
    ans = Math.max(ans, a*c)
    ans = Math.max(ans, b*d)
    ans = Math.max(ans, a*d)
    println(ans)
}
