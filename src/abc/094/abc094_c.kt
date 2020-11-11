fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val X = readLine()!!.split(' ').map { it.toInt() }

    val sorted = X.sorted()
    val l = sorted[N/2 - 1]
    val r = sorted[N/2]
    X.forEach {
        println(
            when {
                it == l -> r
                it == r -> l
                it > l -> l
                it < r -> r
                else -> -1
            }
        )
    }
}
