package abc.`014`.a

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    var ans = 0
    while ((a+ans)%b != 0) ans++
    println(ans)
}
