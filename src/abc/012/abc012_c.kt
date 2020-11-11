fun main(args: Array<String>) {
    var n = readLine()!!.toInt()
    val m = 2025 - n
    for (i in 1..9) {
        if (m%i == 0 && m/i <= 9) {
            println ("$i x ${m/i}")
        }
    }
}
