package abc.`151`.d

import java.util.*

enum class Directions(val dir: Pair<Int,Int>) {
    Up(-1 to 0),
    Down(1 to 0),
    Left(0 to -1),
    Right(0 to 1),
}

fun main(args: Array<String>) {
    val (h, w) = readLine()!!.split(' ').map{ it.toInt() }
    val s = Array(h+2){""}

    var map = Array(h+2){ IntArray(w+2){-1} }

    fun mark(r:Int, c:Int): Int {
        val queue = ArrayDeque<Pair<Pair<Int,Int>, Int>>()
        queue.add((r to c) to 0)

        var max = 0
        while (queue.isNotEmpty()) {
            val q = queue.poll()
            val pos = q.first
            val d = q.second
            if (map[pos.first][pos.second] == -1) {
                max = Math.max(d, max)
                map[pos.first][pos.second] = d
                Directions.values().forEach {
                    val row = pos.first + it.dir.first
                    val col = pos.second + it.dir.second
                    if (s[row][col] != '#' && map[row][col] == -1) {
                        queue.add((row to col) to d + 1)
                    }
                }
            }
        }
        return max
    }

    s[0] = Array(w+2) {'#'}.joinToString("")
    repeat(h) {
        s[it+1] = "#" + readLine()!! + "#"
    }
    s[h+1] = Array(w+2) {'#'}.joinToString("")

    var max = 0
    repeat(h) {r ->
        repeat(w) {c ->
            if (s[r+1][c+1] != '#') {
                map = Array(h + 2) { IntArray(w + 2) { -1 } }
                val ret = mark(r + 1, c + 1)
                max = Math.max(max, ret)
            }
        }
    }
    println(max)
}
