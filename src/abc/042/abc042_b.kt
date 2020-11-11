fun main(args: Array<String>) {
    val (n, l) = readLine()!!.split(' ').map { it.toInt() }
    val s = Array<String>(n){""}
    repeat(n) {
        s[it] = readLine()!!
    }
    s.sort()
    s.forEach {
        print(it)
    }
    println()
}
