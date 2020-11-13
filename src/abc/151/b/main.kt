package abc.`151`.b

fun main(args: Array<String>) {
    val (n, k, m) = readLine()!!.split(' ').map { it.toInt() }
    val a = readLine()!!.split(' ').map { it.toInt() }
    var total = 0
    val need = n*m
    repeat(n-1) {
        total += a[it]
    }
    if (need-total <= 0) println("0")
    else if (need-total > k) println("-1")
    else println("${need-total}")
}
