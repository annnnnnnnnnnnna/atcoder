package abc.`008`.b

fun main() {
    val n = readLine()!!.toInt()
    val c = mutableMapOf<String, Int>()
    var max = 0
    repeat(n) {
        val s = readLine()!!
        if (c[s] == null) c[s] = 0
        c[s] = c[s]!! + 1
        max = Math.max(max, c[s]!!)
    }

    println(c.filter { it.value == max }.keys.first())
}
