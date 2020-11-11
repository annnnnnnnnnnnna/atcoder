fun main(args: Array<String>) {
    val (N, M, X) = readLine()!!.split(' ').map { it.toInt() }
    val A = readLine()!!.split(' ').map { it.toInt() }
    var l = 0
    var r = 0
    A.forEach {
        if (it < X) l++
        else r++
    }
    println(Math.min(l,r))
}
