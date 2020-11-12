package abc.`042`.a

fun main() {
    val a = readLine()!!.split(' ').map { it.toInt() }

    var five = 0
    var seven = 0
    a.forEach {
        if (it == 5) five++
        else if (it == 7) seven++
    }
    if (five == 2 && seven == 1) println("YES")
    else println("NO")
}
