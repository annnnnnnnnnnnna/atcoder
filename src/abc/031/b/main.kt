package abc.`031`.b

fun main() {
    val (l, h) = readLine()!!.split(' ').map { it.toInt() }
    val n = readLine()!!.toInt()
    repeat(n) {
        val a = readLine()!!.toInt()
        println(
            when {
                a < l -> l-a
                a > h -> -1
                else -> 0
            }
        )
    }
}
