package abc.`156`.b

fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }

    var digits = 1
    var tmp = k
    while(tmp <= n) {
        tmp *= k
        digits++
    }
    println(digits)
}
