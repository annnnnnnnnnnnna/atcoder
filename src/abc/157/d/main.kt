package abc.`157`.d

import java.io.PrintWriter
import kotlin.math.*

fun main(args: Array<String>) {
    val (N, M, K) = readLine()!!.split(' ').map { it.toInt() }
    val friend = IntArray(N)
    val block = IntArray(N)
    val uf = UnionFind(N)
    repeat(M) {
        val (A, B) = readLine()!!.split(' ').map { it.toInt() - 1 }
        friend[A]++
        friend[B]++
        uf.union(A,B)
    }
    repeat(K) {
        val (C, D) = readLine()!!.split(' ').map { it.toInt() - 1 }
        if (uf.same(C, D)) {
            block[C]++
            block[D]++
        }
    }
    val ans = IntArray(N)
    repeat(N) {
        ans[it] = uf.size(it) - friend[it] - block[it] - 1
    }
    println(ans.joinToString(" "))
}

private class UnionFind(n: Int) {
    private val parent: MutableList<Int> = MutableList(n) { it }
    private val rank: MutableList<Int> = MutableList(n) { 0 }
    private val size: MutableList<Int> = MutableList(n) { 1 }

    fun union(x: Int, y: Int) {
        var rx = root(x)
        var ry = root(y)
        if (rx == ry) return

        if (rank[rx] < rank[ry]) {
            val tmp = rx
            rx = ry
            ry = tmp
        }

        if (rank[rx] == rank[ry]) rank[rx]++

        parent[ry] = rx
        size[rx] += size[ry]
    }
    fun root(r: Int): Int {
        if (r == parent[r]) return r
        parent[r] = root(parent[r])
        return parent[r]
    }
    fun same(a: Int, b: Int): Boolean {
        return root(a) == root(b)
    }
    fun size(x: Int): Int = size[root(x)]
}
