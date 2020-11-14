package abc.`176`.e

fun main(args: Array<String>) {
    val (H, W, M) = readLine()!!.split(' ').map { it.toInt() }
    val arrH = IntArray(H+1)
    val arrW = IntArray(W+1)
    val arr = mutableSetOf<Pair<Int, Int>>()

    arrH[0] = 0
    arrW[0] = 0

    repeat(M) {
        val (h, w) = readLine()!!.split(' ').map { it.toInt() }

        arrH[h]++
        arrW[w]++
        arr.add(h to w)
    }

    val hmax = arrH.max()!!
    val wmax = arrW.max()!!

    val ans = hmax + wmax

    val lstH = arrH.withIndex().filter { it.value == hmax }.map { it.index}
    val lstW = arrW.withIndex().filter { it.value == wmax }.map { it.index}

    lstH.forEach { i ->
        lstW.forEach { j ->
            if (i to j !in arr) {
                println(ans)
                return
            }
        }
    }
    println(ans - 1)
}
