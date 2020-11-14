package abc.`165`.c

fun main(args: Array<String>) {
    val (N, M, Q) = readLine()!!.split(' ').map { it.toInt() }

    val A = IntArray(N)
    val arr = Array(Q) {IntArray(4)}
    repeat(Q) {
        val (a, b, c, d) = readLine()!!.split(' ').map { it.toInt() }
        arr[it][0] = a
        arr[it][1] = b
        arr[it][2] = c
        arr[it][3] = d
    }

    fun check(): Long {
        var ret = 0L
        repeat(Q) {
            val a = arr[it]
            if(A[a[1]-1] - A[a[0]-1] == a[2]) {
                ret += a[3]
            }
        }
        return ret
    }

    var max = 0L
    fun create(n:Int, min:Int) {
        for (m in min .. M) {
            A[n]= m
            if (n+1 == N) {
                max = Math.max(max, check())
            } else {
                create(n+1, m)
            }
        }
    }

    create(0,1)
    println(max)
}
