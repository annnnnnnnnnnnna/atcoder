package abc.`017`.a

fun main() {
    var ans = 0
    repeat(3) {
        val (s, e) = readLine()!!.split(' ').map { it.toInt() }
        ans += s*e
    }
    println(ans/10)
}
