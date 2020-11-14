package abc.`173`.c

fun main(args: Array<String>) {
    val (h, w, k) = readLine()!!.split(' ').map { it.toInt() }
    val map = Array<String>(h) {""}

    repeat(h) {
        val s = readLine()!!
        map[it] = s
    }

    var answer = 0
    fun chk(delH: BooleanArray, delW:BooleanArray) {
        var cnt = 0
        for (i in 0 until h) {
            for (j in 0 until w) {
                if (map[i][j] == '#' && !delH[i] && delW[j]) cnt++
            }
        }
        if (cnt == k) answer++
    }

    val delListH = BooleanArray(h) { false }
    val delListW = BooleanArray(w) { false }

    fun createW(d:Int) {
        arrayOf(true,false).forEach {
            delListW[d] = it
            if (d+1 == w) {
                chk(delListH, delListW)
            } else {
                createW(d+1)
            }
        }
    }

    fun createH(d:Int) {
        arrayOf(true,false).forEach {
            delListH[d] = it
            if (d+1 == h) {
                createW(0)
            } else {
                createH(d+1)
            }
        }
    }

    createH(0)
    println(answer)
}
