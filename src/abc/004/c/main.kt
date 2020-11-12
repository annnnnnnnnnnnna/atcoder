package abc.`004`.c

fun main() {
    val n = readLine()!!.toInt()
    val mod = n % 5
    val times = (n / 5) % 6
    val start = when(times) {
        0 -> "1" to StringBuilder("23456")
        1 -> "2" to StringBuilder("34561")
        2 -> "3" to StringBuilder("45612")
        3 -> "4" to StringBuilder("56123")
        4 -> "5" to StringBuilder("61234")
        else -> "6" to StringBuilder("12345")
    }
    println(start.second.insert(mod, start.first).toString())
}
