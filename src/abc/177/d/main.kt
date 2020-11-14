package abc.`177`.d

private class UnionFind(n: Int) {
    val parent = IntArray(n+1)
    val size = IntArray(n+1)

    init {
        repeat(n+1) {
            parent[it] = it
            size[it] = 1
        }
    }
    fun union(par: Int, chi: Int) {
        if (same(par, chi)) return
        val sz = size[root(chi)]
        parent[root(chi)] = par
        size[root(par)] += sz
    }
    fun root(r: Int): Int {
        if (r == parent[r]) return r
        val par = root(parent[r])
        parent[r] = par
        return par
    }
    fun same(a: Int, b: Int): Boolean {
        return root(a) == root(b)
    }
}

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }

    val friend = IntArray(n)

    val uf = UnionFind(n)

    repeat(m) {
        val (a, b) = readLine()!!.split(' ').map { ab -> ab.toInt() }
        friend[a-1] += 1
        friend[b-1] += 1
        uf.union(a, b)
    }
    println(uf.size.max())
}
