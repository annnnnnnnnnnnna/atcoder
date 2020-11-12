package abc.`094`.d

fun main() {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(' ').map { it.toInt() }

    val n = A.max()!!
    val half = n/2.0
    val r = A.minus(n).sortedBy { Math.abs(it -half) }[0]

    println ("$n $r")
}
