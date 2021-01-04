package abc.`187`.e

import java.io.PrintWriter
import java.util.*

@JvmField val _writer = PrintWriter(System.out, false)
fun main() { _writer.solve(); _writer.flush() }
fun PrintWriter.solve() {
    val N = nextInt()
    val tree = Array(N) { mutableSetOf<Int>() }
    val ab = (1 until N).map {
        val a = nextInt() -1
        val b = nextInt() -1
        tree[a].add(b)
        tree[b].add(a)
        a to b
    }
    val point = LongArray(N)
    val depth = IntArray(N) { -1 }

    val root = 0

    val dq = ArrayDeque<Pair<Int, Int>>()
    val visited = BooleanArray(N)
    dq.add(root to 0)
    visited[root] = true
    while(dq.isNotEmpty()) {
        val (pos, d) = dq.pollFirst()
        depth[pos] = d
        tree[pos].forEach {
            if (!visited[it]) {
                dq.add(it to d+1)
                visited[it] = true
            }
        }
    }


    val Q = nextInt()
    (1 .. Q).map {
        val t = nextInt()
        val e = nextInt() - 1
        val x = nextLong()
        val (a, b) = when(t) {
            1 -> ab[e].first to ab[e].second
            2 -> ab[e].second to ab[e].first
            else -> -1 to -1
        }
        if (depth[a] < depth[b]) {
            point[root] += x
            point[b] -= x
        } else {
            point[a] += x
        }
    }

    val queue = ArrayDeque<Int>()
    queue.add(root)
    while(queue.isNotEmpty()) {
        val i = queue.pollFirst()
        tree[i].forEach {
            if (depth[i] < depth[it]) {
                point[it] += point[i]
                queue.add(it)
            }
        }
    }

    point.forEach { println(it) }
}

private var st = StringTokenizer("")
private val br = System.`in`.bufferedReader()

fun next(): String {
    while (!st.hasMoreTokens()) st = StringTokenizer(br.readLine())
    return st.nextToken()
}
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun nextLine() = br.readLine()
fun nextDouble() = next().toDouble()
