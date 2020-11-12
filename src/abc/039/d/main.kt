package abc.`039`.d

fun main() {
    val (h, w) = readLine()!!.split(' ').map { it.toInt() }
    val inField = Array(h){ "" }
    val judgeField = Array(h){ CharArray(w) }
    val ansField = Array(h){ CharArray(w) }
    var nazo = 0
    repeat(h) {i->
        val s = readLine()!!
        inField[i] = s
        ansField[i] = s.toCharArray()
        judgeField[i] = s.replace("#", "?").toCharArray()
        nazo += s.count { it == '#' }
    }

    fun chk(i: Int, j: Int): Boolean {
        val iMin = Math.max(i-1, 0)
        val iMax = Math.min(i+1, h-1)
        val jMin = Math.max(j-1, 0)
        val jMax = Math.min(j+1, w-1)

        var all = true
        for (ii in iMin .. iMax) {
            for (jj in jMin .. jMax) {
                if(inField[ii][jj] == '.') all = false
            }
        }
        if (all) {
            for (ii in iMin..iMax) {
                for (jj in jMin..jMax) {
                    if (judgeField[ii][jj] == '?') {
                        judgeField[ii][jj] = '#'
                        nazo--
                    }
                }
            }
        }
        return all
    }
    for (i in 0 until h) {
        for (j in 0 until w) {
            ansField[i][j] = if(chk(i,j)) '#'
            else '.'
        }
    }
    if (nazo != 0) {
        println("impossible")
    } else {
        println("possible")
        repeat(h) {
            println(ansField[it].joinToString(""))
        }
    }
}
