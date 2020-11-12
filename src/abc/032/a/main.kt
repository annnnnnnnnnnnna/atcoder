package abc.`032`.a

fun main() {
    val A = readLine()!!.toInt()
    val B = readLine()!!.toInt()
    val N = readLine()!!.toInt()

    fun prime(num: Int): List<Pair<Int,Int>> {
        var n = num
        val s = Math.floor(Math.sqrt(n.toDouble())).toInt()
        var r = 0
        val res = mutableListOf<Pair<Int,Int>>()
        for (i in 2..s) {
            if (n%i == 0) {
                r = 0
                while(n%i == 0) {
                    r++
                    n /= i
                }
                res.add(i to r)
            }
        }
        if (n > s) res.add(n to 1)
        return res
    }

    fun lcm (a:Int, b:Int): Int {
        val primeA = prime(a)
        val primeB = prime(b)
        var ret = 1
        val primeAB = mutableSetOf<Int>()
        primeA.forEach { pa ->
            val paa = pa.first
            primeB.forEach { pb->
                val pbb = pb.first
                if (paa == pbb) {
                    val num = Math.max(pa.second,pb.second)
                    ret *= Math.pow(paa.toDouble(), num.toDouble()).toInt()
                    primeAB.add(paa)
                }
            }
        }
        primeA.forEach {
            if (it.first !in primeAB) {
                ret *= Math.pow(it.first.toDouble(), it.second.toDouble()).toInt()
            }
        }
        primeB.forEach {
            if (it.first !in primeAB) {
                ret *= Math.pow(it.first.toDouble(), it.second.toDouble()).toInt()
            }
        }

        return ret
    }
    val l = lcm(A,B)
    var ans = l
    while (ans < N) {
        ans += l
    }
    println(ans)
}
