package abc.`046`.b

fun main() {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    var ans = k.toLong()
    repeat(n-1) {
        ans *= k-1
    }
    println(ans)
}
