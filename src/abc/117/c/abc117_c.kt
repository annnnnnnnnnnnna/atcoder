package abc.`117`.c

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }
    val x = readLine()!!.split(' ').map { it.toInt() }.sorted()

    val distances = IntArray(m) {0}
    var prev = x[0]
    var ans = x[x.size-1] - x[0]
    repeat(m) {
        val dist = x[it] - prev
        distances[it] = dist
        prev = x[it]
    }
    distances.sortDescending()


    repeat(Math.min(n-1,m)) {
        ans -= distances[it]
    }
    println(ans)
}
