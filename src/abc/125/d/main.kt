package abc.`125`.d

fun main() {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(' ').map { it.toInt() }.toIntArray()

    var ans = 0L
    var minusCount = 0
    var zeroCount = 0
    val B = IntArray(N)
    for (i in 0 until N) {
        if (A[i] < 0) minusCount++
        if (A[i] == 0) zeroCount++
        B[i] = Math.abs(A[i])
        ans += B[i]
    }
    if (zeroCount == 0 && minusCount % 2 ==1) {
        ans -= B.min()!! * 2
    }
    println (ans)
}
