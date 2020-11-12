package abc.`010`.b

fun main() {
    val n = readLine()!!.toInt()
    var ans = 0
    readLine()!!.split(' ').map {
        val a = it.toInt()
        ans += when (a) {
            6 ->3
            5 -> 2
            2,4,8 ->1
            else -> 0
        }
    }
    println(ans)
}
