package abc.`142`.d

fun main() {
    val (a, b) = readLine()!!.split(' ').map { it.toLong() }

    fun so(m: Long): MutableList<Pair<Long,Long>> {
        var n = m
        val s = Math.floor(Math.sqrt(n.toDouble())).toLong()
        var r = 0L
        val res = mutableListOf<Pair<Long,Long>>()
        for (i in 2..s) {
            if (n%i == 0L) {
                r = 0L
                while(n%i == 0L) {
                    r++
                    n = n/i
                }
                res.add(i to r)
            }
        }
        if (n > s) res.add(n to 1)
        return res
    }

    fun gcd(a: Long, b: Long): Long {
        return if (a==1L || b== 1L) 1L
        else if (b == 0L) a
        else if (a < b) gcd(a, b % a)
        else gcd(b, a % b)
    }
    val g = gcd(a,b)
    val insuu = so(g)

    println(insuu.size + 1)
}
