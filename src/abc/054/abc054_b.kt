fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }

    val a = Array(n){""}
    repeat(n) {
        a[it] = readLine()!!
    }
    val b = Array(m){""}
    repeat(m) {
        b[it] = readLine()!!
    }

    var ans = false
    for (k in 0..n-m) {
        for (l in 0..n-m) {

            var same = true
            for (i in 0 until m) {
                for (j in 0 until m) {
                    if (a[i+k][j+l] != b[i][j]) {
                        same = false
                        break
                    }
                }
                if (!same) break
            }
            if (same) {
                ans = true
                break
            }
        }
        if (ans) break
    }

    if (ans) println("Yes")
    else println("No")
}
