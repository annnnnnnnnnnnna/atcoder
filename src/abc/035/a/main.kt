package abc.`035`.a

fun main() {
    val (w, h) = readLine()!!.split(' ').map { it.toDouble() }
    val a = w/h
    if (a == 4.0/3.0) println("4:3")
    else println("16:9")
}
