package abc.`052`.b

fun main() {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    var ans = 0
    var now = 0
    repeat(n) {
        when(s[it]) {
            'I' -> now++
            'D' -> now--
        }
        ans = Math.max(ans, now)
    }
    println(ans)
}
