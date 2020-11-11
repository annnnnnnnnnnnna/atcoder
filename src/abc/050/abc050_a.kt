fun main(args: Array<String>) {
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
