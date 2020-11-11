fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toInt() }

    var cnt = 0
    var sum = 0.0
    a.forEach {
        if (it > 0) {
            cnt++
            sum += it
        }
    }
    println(Math.ceil(sum/cnt).toLong())
}
