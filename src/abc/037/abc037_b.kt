fun main(args: Array<String>) {
    val (n, q) = readLine()!!.split(' ').map { it.toInt() }
    val arr = Array(n){0}
    repeat(q) {
        val (l, r, t) = readLine()!!.split(' ').map { it.toInt()}
        for (i in l-1 until r) {
            arr[i] = t
        }
    }

    repeat(n) {
        println(arr[it])
    }
}
