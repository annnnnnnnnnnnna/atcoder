package abc.`007`

// 幅優先探索
import java.util.ArrayDeque

enum class Directions(val dir: Pair<Int,Int>) {
    U(1 to 0),
    D(-1 to 0),
    L(0 to -1),
    R(0 to 1),
}

fun main(args: Array<String>) {
    val (r, c) = readLine()!!.split(' ').map { it.toInt() }
    val (sy, sx) = readLine()!!.split(' ').map { it.toInt()-1 }
    val (gy, gx) = readLine()!!.split(' ').map { it.toInt()-1 }

    val field = Array(r){CharArray(c)}
    repeat(r) {
        field[it] = readLine()!!.toCharArray()
    }

    val queue = ArrayDeque<Pair<Pair<Int, Int>, Int>>()
    queue.add((sy to sx) to 0)
    while (queue.isNotEmpty()) {
        val (pos, d) = queue.pollFirst()
        if (pos == gy to gx) {
            println(d)
            return
        }
        Directions.values().forEach {
            val y = pos.first + it.dir.first
            val x = pos.second + it.dir.second
            if (y in 0 until r && x in 0 until c && field[y][x] == '.') {
                field[y][x] = d.toString()[0]
                queue.add((y to x) to d + 1)
            }
        }
    }
}
