fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    var sum = 0
    val a = readLine()!!.split(' ').map {
        val num = it.toInt()
        sum += num
        num
    }
    val ave = sum/N
    var u = 0
    var o = 0
    repeat(N) {
        u += (a[it] - ave) * (a[it] - ave)
        o += (a[it] - (ave+1)) * (a[it] - (ave+1))
    }
    println(Math.min(u,o))
}
