package abc.`128`.c

fun main() {
    val (N, M) = readLine()!!.split(' ').map { it.toInt() }
    val cond = Array(M) {Array(N) {false} }
    repeat(M) {
        val ks = readLine()!!.split(' ').map { it.toInt()-1 }
        for (i in 1 until ks.size) {
            cond[it][ks[i]] = true
        }
    }
    val p = readLine()!!.split(' ').map { it.toInt() }

    fun chk(onoff: String): Boolean {
        val sw = BooleanArray(M) {false}
        cond.forEachIndexed { i, booleans ->
            booleans.forEachIndexed { j, b ->
                if (b && onoff[j] == '1') sw[i] = !sw[i]
            }
        }
        for (i in p.indices) {
            if (p[i] == 1 && !sw[i] || p[i] == 0 && sw[i]) return false
        }
        return true
    }

    val max = Math.pow(2.0, N.toDouble()).toInt()
    var ans = 0
    for (i in 0 until max) {
        val bstr = String.format("%${N}s", Integer.toBinaryString(i)).replace(" ", "0")
        if (chk(bstr)) ans++
    }
    println(ans)
}
