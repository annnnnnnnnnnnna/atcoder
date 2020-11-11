package abc.`145`.c

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val xy = Array(n){ 0.0 to 0.0 }
    repeat(n) {
        val (x, y) = readLine()!!.split(' ').map { it.toDouble() }
        xy[it] = x to y
    }

    val arr = Array(n){0}

    fun dist (a: Pair<Double,Double>, b: Pair<Double,Double>): Double =
        Math.sqrt((a.first-b.first)*(a.first-b.first)+(a.second-b.second)*(a.second-b.second))

    var calced = 0
    fun calc (arr: Array<Int>): Double {
        calced++
        var sum = 0.0
        for (i in 0..n-2) {
            sum+= dist(xy[arr[i]], xy[arr[i+1]])
        }
        return sum
    }

    var sum = 0.0
    fun make(l: List<Int>, d:Int) {
        for (e in l) {
            arr[d] = e
            if (d == n-1) {
                sum += calc(arr)
            } else {
                make(l - e, d+1)
            }
        }
    }
    make((0 until n).toList(),0)
    println(sum/calced)
}
