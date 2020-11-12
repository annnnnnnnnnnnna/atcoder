package abc.`014`.b

fun main() {
    val (n, x) = readLine()!!.split(' ').map { it.toInt() }
    val a = readLine()!!.split(' ').map { it.toInt() }
    var pow2 = 1
    var ans = 0
    for (i in 0 until n) {
        if (x.and(pow2) != 0) {
            ans += a[i]
        }
        pow2 *= 2
    }
    println(ans)
}
