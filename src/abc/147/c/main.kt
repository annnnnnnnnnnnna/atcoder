package abc.`147`.c

fun main() {
    val n = readLine()!!.toInt()

    val s = arrayOfNulls<List<Pair<Int, Int>>>(n)
    repeat(n) {
        val a = readLine()!!.toInt()
        val lst = mutableListOf<Pair<Int, Int>>()
        repeat(a) {
            val (x, y) = readLine()!!.split(' ').map { it.toInt() }
            lst.add(x-1 to y)
        }
        s[it] = lst
    }

    var ans = 0

    fun chk(onoff: String) {
        val oncnt = onoff.count { it == '1' }
        if (oncnt <= ans) return
        var success = true
        val state = IntArray(n) { -1 }
        var changed = true
        while (changed && success) {
            changed = false
            for (i in onoff.indices) {
                if (onoff[i] == '1' || state[i] == 1) {
                    state[i] = 1
                    val shogen = s[i]
                    shogen!!.forEach {
                        val target = it.first
                        if (state[target] == -1) {
                            state[target] = it.second
                            changed = true
                        } else {
                            success = success && (state[target] == it.second)
                        }
                    }
                }
            }
        }
        if (success) {
            ans = state.count { it == 1 }
        }
    }

    val max = Math.pow(2.0, n.toDouble()).toInt() -1
    for (i in 0..max) {
        val bStr = String.format("%${n}s", Integer.toBinaryString(i)).replace(" ", "0")
        chk(bStr)
    }

    println(ans)
}
