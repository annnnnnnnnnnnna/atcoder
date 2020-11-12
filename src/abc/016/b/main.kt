package abc.`016`.b

fun main() {
    val (a, b, c) = readLine()!!.split(' ').map { it.toInt() }
    println(
        if(a+b == c && a-b != c) "+"
        else if (a+b != c && a-b == c) "-"
        else if (a+b == c && a-b == c) "?"
        else "!"
    )
}
