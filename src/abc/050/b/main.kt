package abc.`050`.b

fun main() {
    val n = readLine()!!.toInt()
    val t = readLine()!!.split(' ').map { it.toInt() }
    val sum = t.sum()
    val m = readLine()!!.toInt()

    repeat(m) {
        val (p, x) = readLine()!!.split(' ').map { it.toInt() }
        val d = t[p-1] - x
        println(sum-d)
    }
}
