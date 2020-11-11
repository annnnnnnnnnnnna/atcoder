fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }
    val friend = Array(n) { Array(n){false} }
    repeat(n) {
        friend[it][it] = true
    }
    repeat(m) {
        val (a, b) = readLine()!!.split(' ').map { it.toInt()-1 }
        friend[a][b] = true
        friend[b][a] = true
    }
    for (i in 0 until n) {
        val added = mutableSetOf<Int>()
        for (j in 0 until n) {
            if (i == j) continue
            if(!friend[i][j]) continue
            for (k in 0 until n) {
                if (i == k || j == k) continue
                if(!friend[i][k] && friend[j][k]) {
                    added.add(k)
                }
            }
        }
        println (added.size)
    }
}
