package abc.`171`.c

fun main(args: Array<String>) {
    var n = readLine()!!.toLong()

    val ans = StringBuffer("")
    while(n > 0) {
        n--
        val d = n % 26
        n /= 26
        ans.append('a' + d.toInt())
    }

    println(ans.reverse().toString())
}
