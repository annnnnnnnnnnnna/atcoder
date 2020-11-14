package abc.`171`.b

fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val p = readLine()!!.split(' ').map { it.toInt() }.sorted()

    var ans = 0
    repeat(k) {
        ans += p[it]
    }
    println(ans)
}
