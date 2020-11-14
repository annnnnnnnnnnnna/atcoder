package abc.`171`.e

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    var allXOR = 0
    val a = readLine()!!.split(' ').map {
        val num = it.toInt()
        allXOR = (allXOR xor num)
        num
    }

    repeat(n) {
        if (it != 0) print(" ")
        print(allXOR xor a[it])
    }
    println()
}
