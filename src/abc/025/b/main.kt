package abc.`025`.b

fun main() {
    val (n, a, b) = readLine()!!.split(' ').map { it.toInt() }
    var pos = 0
    repeat(n) {
        val (s, ds) = readLine()!!.split(' ')
        val d = ds.toInt()
        val move = if (d < a) a else if (b < d) b else d
        when (s) {
            "East" -> pos += move
            "West" -> pos -= move
        }
    }
    println(
        when {
            pos > 0 -> "East $pos"
            pos < 0 -> "West ${Math.abs(pos)}"
            else -> "0"
        }
    )
}
