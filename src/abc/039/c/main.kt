package abc.`039`.c

fun main() {
    val s = readLine()!!
    val str = "WBWBWWBWBWBWWBWBWWBWBWBWWBWBWWBWBWBWWBWBWWBWBWBW"
    val pos = str.indexOf(s)
    println(
        when(pos) {
            0 -> "Do"
            2 -> "Re"
            4 -> "Mi"
            5 -> "Fa"
            7 -> "So"
            9 -> "La"
            11 -> "Si"
            else -> "?"
        }
    )
}
