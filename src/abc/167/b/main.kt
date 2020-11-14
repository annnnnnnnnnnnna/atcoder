package abc.`167`.b

fun main(args: Array<String>) {
    val (a, b, c, k) = readLine()!!.split(' ').map { it.toLong() }
    var d = k
    var ans = Math.min(a,d)

    d -= a
    d -= b
    if (d > 0) {
        ans -= d
    }

    println(ans)

}
