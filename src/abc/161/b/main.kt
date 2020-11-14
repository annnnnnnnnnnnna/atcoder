package abc.`161`.b

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }
    val a = readLine()!!.split(' ').map { it.toInt() }

    var sum = 0.0
    repeat(n) {
        sum += a[it]
    }
    val border = sum/(4 * m)

    var oknum = 0
    repeat(n) {
        if(a[it] >= border) oknum++
    }

    if(oknum >= m) println("Yes")
    else println("No")
}
