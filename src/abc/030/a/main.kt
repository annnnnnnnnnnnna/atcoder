package abc.`030`.a

fun main() {
    val (a, b, c, d) = readLine()!!.split(' ').map { it.toDouble() }
    val tr = b/a
    val ar = d/c
    println(
        if (tr > ar) "TAKAHASHI"
        else if (ar > tr) "AOKI"
        else "DRAW"
    )
}
