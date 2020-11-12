package abc.`001`.b

fun main() {
    val m = readLine()!!.toInt()
    println(when {
        m < 100 -> "00"
        m < 1000 -> "0" + (m/100).toString()
        m <= 5000 -> (m/100).toString()
        m <= 30000 -> (m/1000 + 50).toString()
        m <= 70000 -> ((m/1000 - 30)/ 5 + 80).toString()
        else -> "89"
    }
    )
}
