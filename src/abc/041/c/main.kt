package abc.`041`.c

fun main() {
    val n = readLine()!!.toInt()
    var cnt = 0
    val a = readLine()!!.split(' ').map {
        it.toInt() to ++cnt
    }
    a.sortedByDescending { it.first }.forEach {
        println(it.second)
    }
}
