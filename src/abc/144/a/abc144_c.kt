package abc.`144`.a

fun main(args: Array<String>) {
    val n = readLine()!!.toLong()

    val s = Math.floor(Math.sqrt(n.toDouble())).toLong()

    var ans = Long.MAX_VALUE
    for (a in 1 .. s) {
        if (n%a == 0L) {
            val b = n/a
            val tmp = a+b-2
            ans = Math.min(ans, tmp)
        }
    }
    println(ans)
}
