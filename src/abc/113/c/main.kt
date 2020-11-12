package abc.`113`.c

fun main() {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }

    val data = mutableMapOf<Int, MutableList<Int>>()
    val inp = arrayOfNulls<Pair<Int,Int>>(m)
    repeat(m) {
        val (p, y) = readLine()!!.split(' ').map { it.toInt() }
        inp[it] = p to y
        if(data[p] == null) data[p] = mutableListOf()
        data[p]!!.add(y)
    }

    val sorted = mutableMapOf<Int, MutableMap<Int,Int>>()
    data.forEach { d ->
        val shiList = d.value
        if (shiList != null) {
            val shiSorted = mutableMapOf<Int, Int>()
            var cnt = 1
            shiList.sortedBy { it }.forEach {
                shiSorted[it] = cnt
                cnt++
            }
            sorted[d.key] = shiSorted
        }
    }

    inp.forEach {
        println("%06d".format(it!!.first) + "%06d".format(sorted[it.first]!![it.second]) )
    }
}


