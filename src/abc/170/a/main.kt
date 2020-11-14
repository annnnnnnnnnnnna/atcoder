package abc.`170`.a

fun main(args: Array<String>) {
    val (x1, x2, x3 , x4, x5) = readLine()!!.split(' ').map { it.toInt() }
    println(when{
        x1 == 0 -> 1
        x2 == 0 -> 2
        x3 == 0 -> 3
        x4 == 0 -> 4
        x5 == 0 -> 5
        else -> 0
    }
    )
}
