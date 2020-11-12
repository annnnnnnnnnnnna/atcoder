package abc.`028`.a

fun main() {
    val n = readLine()!!.toInt()
    println(when {
        n < 60 -> "Bad"
        n < 90 -> "Good"
        n < 100 -> "Great"
        else -> "Perfect"
    }
    )
}
