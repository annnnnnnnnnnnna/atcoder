package abc.`051`.c

fun main() {
    val (sx, sy, tx, ty ) = readLine()!!.split(' ').map { it.toInt() }

    val x = tx - sx
    val y = ty - sy
    val forth = "U".repeat(y) + "R".repeat(x)
    val back = "D".repeat(y) + "L".repeat(x)
    println ("$forth${back}LU${forth}RDRD${back}LU")
}
