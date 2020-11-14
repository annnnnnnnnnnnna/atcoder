package abc.`176`.b

fun main(args: Array<String>) {
    val n = readLine()!!

    var sum = 0
    for (i in n.indices) {
        sum += n[i].toString().toInt()
    }
    if (sum%9 == 0) println("Yes")
    else println("No")
}
