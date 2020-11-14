package abc.`177`.e

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()

    val allP = mutableSetOf<Int>()
    val chkP = mutableSetOf<Int>()
    var pc = true

    fun sb(inp :Int): Set<Int> {
        var n = inp
        val s = Math.floor(Math.sqrt(n.toDouble())).toInt()
        val ret = mutableSetOf<Int>()
        if (!pc) {
            chkP.forEach {
                if (n % it == 0) {
                    ret.add(it)
                }
            }
        } else {
            if (n % 2 == 0) {
                ret.add(2)
                while (n % 2 == 0) {
                    n /= 2
                }            }
            var i = 3
            while (i <= s) {
                if (n % i == 0) {
                    ret.add(i)
                    while (n % i == 0) {
                        n /= i
                    }
                }
                i += 2
            }
            if (n > s) ret.add(n)
        }
        return ret
    }
    fun gcd(a: Int, b: Int): Int {
        return if (a==1 || b== 1) 1
        else if (b == 0) a
        else if (a < b) gcd(a, b % a)
        else gcd(b, a % b)
    }

    var allGCD = -1
    readLine()!!.split(' ').map { s->
        if (pc) {
            val p = sb(s.toInt())
            p.forEach {
                if (it in allP) {
                    pc = false
                    chkP.add(it)
                }
                allP.add(it)
            }
        }
        allGCD = if (allGCD != -1) gcd(allGCD, s.toInt())
        else s.toInt()
    }

    println(
        when {
            pc -> "pairwise coprime"
            allGCD == 1 -> "setwise coprime"
            else -> "not coprime"
        }
    )
}
