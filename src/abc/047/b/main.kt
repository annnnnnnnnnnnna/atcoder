package abc.`047`.b

fun main() {
    val (w, h, n) = readLine()!!.split(' ').map { it.toInt() }
    val field = Array(h) { BooleanArray(w) { true } }
    repeat (n) {
        val (x, y, a) = readLine()!!.split(' ').map { it.toInt() }
        val (xmin, xmax, ymin, ymax) = when (a) {
            1 -> listOf(0, x, 0, h)
            2 -> listOf(x, w, 0, h)
            3 -> listOf(0, w, 0, y)
            4 -> listOf(0, w, y, h)
            else -> listOf()
        }
        for (i in ymin until ymax) {
            for (j in xmin until xmax) {
                field[i][j] = false
            }
        }
    }
    println(field.map{ it.count{ it } }.sum())
}
