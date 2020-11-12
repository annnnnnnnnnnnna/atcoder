package abc.`038`.b

fun main() {
    val (h1, w1) = readLine()!!.split(' ').map { it.toInt() }
    val (h2, w2) = readLine()!!.split(' ').map { it.toInt() }
    if (h1 == h2 || h1 == w2 || w1 == h2 || w1 == w2) println("YES")
    else println("NO")
}
