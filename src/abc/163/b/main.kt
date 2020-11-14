package abc.`163`.b

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }

    val a = readLine()!!.split(' ').map { it.toInt() }
    var sum = 0
    repeat(m) {
        sum += a[it]
    }

    if (n-sum >= 0) {
        println(n-sum)
    } else println(-1)
}
