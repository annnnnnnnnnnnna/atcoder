fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val x = readLine()!!.split(' ').map { it.toInt() }
    val sum = IntArray(n - k + 1){0}

    var min = 1000000000
    for (i in 0 .. n-k) {
        val left = x[i]
        val right = x[i + k-1]
        val tmp = if (left < 0 && right > 0 || left > 0 && right < 0 ) {
            Math.abs(left) +  Math.abs(right) + Math.min(Math.abs(left), Math.abs(right))
        } else {
            if (left < 0) Math.abs(left)
            else Math.abs(right)
        }
        min = Math.min(min, tmp)
    }
    println(min)
}
