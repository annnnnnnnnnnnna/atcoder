package abc.`026`.c

fun main() {
    val n = readLine()!!.toInt()
    val soshiki = Array(n+1) { mutableSetOf<Int>() }
    repeat(n-1) {
        val b = readLine()!!.toInt()
        soshiki[b].add(it+2)
    }

    fun sal(id: Int): Int {
        if (soshiki[id].size == 0) return 1
        val buka = soshiki[id].map {
            sal(it)
        }
        return buka.min()!! + buka.max()!! + 1
    }
    println(sal(1))
}
