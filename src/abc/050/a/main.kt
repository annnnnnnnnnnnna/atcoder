package abc.`050`.a

fun main() {
    val (a, op, b) = readLine()!!.split(' ')
    when(op) {
        "+" -> {
            println(a.toInt() + b.toInt())
        }
        "-" -> {
            println(a.toInt() - b.toInt())
        }
    }
}
