package abc.`176`.d

import java.util.*

enum class Directions(val dir: Pair<Int,Int>) {
    U(0 to 1),
    D(0 to -1),
    L(-1 to 0),
    R(1 to 0),
}

enum class Warp(val dir: Pair<Int,Int>) {
    U21(-2 to 2), U22(-1 to 2), U23(0 to 2), U24(1 to 2), U25(2 to 2),
    U11(-2 to 1), U12(-1 to 1),                  U14(1 to 1), U15(2 to 1),
    LR1(-2 to 0),                                                      LR5(2 to 0),
    D11(-2 to -1), D12(-1 to -1),                   D14(1 to -1), D15(2 to -1),
    D21(-2 to -2), D22(-1 to -2), D23(0 to -2), D24(1 to -2), D25(2 to -2),
}

fun main(args: Array<String>) {
    val (h, w) = readLine()!!.split(' ').map { it.toInt() }
    val (ch, cw) = readLine()!!.split(' ').map { it.toInt() }
    val (dh, dw) = readLine()!!.split(' ').map { it.toInt() }

    val field = Array(h+2) {Array(w+2){'#'} }
    repeat(h) {
        field[it+1] = arrayOf('#') + readLine()!!.toCharArray().toTypedArray() + arrayOf('#')
    }

    val queue = ArrayDeque<Pair<Int,Int>>()
    val queueWarp = ArrayDeque<Pair<Int,Int>>()
    queue.add(ch to cw)

    var d = 0
    var nowH = ch
    var nowW = cw
    while (!(nowH == dh && nowW == dw)) {
        while (queueWarp.isNotEmpty()) {
            val pos = queueWarp.poll()
            if(field[pos.first][pos.second] == '.') queue.add(pos)
        }
        while (queue.isNotEmpty()) {
            val pos = queue.poll()
            if (field[pos.first][pos.second] == '.') {
                nowH = pos.first
                nowW = pos.second
                field[pos.first][pos.second] = '#'
                if (nowH == dh && nowW == dw) {
                    println(d)
                    return
                }
                Directions.values().forEach {
                    val row = pos.first + it.dir.first
                    val col = pos.second + it.dir.second
                    if (row > 0 && col > 0 && row <= h && col <= w && field[row][col] != '#') {
                        queue.add(row to col)
                    }
                }
                Warp.values().forEach {
                    val row = pos.first + it.dir.first
                    val col = pos.second + it.dir.second
                    if (row > 0 && col > 0 && row <= h && col <= w && field[row][col] != '#') {
                        queueWarp.add(row to col)
                    }
                }
            }
        }
        if (queue.isEmpty() && queueWarp.isEmpty()) {
            println(-1)
            return
        }
        d++
    }
}
