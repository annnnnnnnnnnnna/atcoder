package abc.`129`.d

fun main() {
    val (h, w) = readLine()!!.split(' ').map { it.toInt() }
    val sArr = Array<String>(h + 1) {""}

    val yoko = Array(h + 1) {IntArray(w + 1){-1}}
    val tate = Array(h + 1) {IntArray(w + 1){-1}}
    fun yokoCheck(r:Int, c:Int, len: Int): Int {
        if (yoko[r][c] != -1) return yoko[r][c]
        if (sArr[r][c] == '#') {
            yoko[r][c] = 0
        }else if (sArr[r][c + 1] == '#' || c + 1 == w) {
            yoko[r][c] = len
        } else {
            val tmp = yokoCheck(r, c+1, len+1)
            yoko[r][c] = tmp
        }
        return yoko[r][c]
    }

    fun tateCheck(r:Int, c:Int, len: Int): Int {
        if (tate[r][c] != -1) return tate[r][c]
        if (sArr[r][c] == '#') {
            tate[r][c] = 0
        }else if (sArr[r + 1][c] == '#' || r + 1 == h) {
            tate[r][c] = len
        } else {
            val tmp = tateCheck(r+1, c, len+1)
            tate[r][c] = tmp
        }
        return tate[r][c]
    }

    repeat(h) {row->
        val s = readLine()!! + "#"
        sArr[row] = s
        repeat(w) {col ->
            yokoCheck(row, col, 1)
        }
    }
    val sb = StringBuffer("")
    repeat(w+1) { sb.append('#') }
    sArr[h] = sb.toString()

    var max = 0 to 0
    repeat(w) { col ->
        repeat(h) {row ->
            tateCheck(row, col, 1)
            if (max.first + max.second -1 <= tate[row][col] + yoko[row][col] -1) max = tate[row][col] to yoko[row][col]
        }
    }
    println(max.first + max.second -1)
}

