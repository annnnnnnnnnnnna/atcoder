package abc.`162`.b

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    var answer = 0L
    for (i in 1 .. n) {
        if (i%3 != 0 && i%5 != 0) answer += i
    }
    println(answer)
}
