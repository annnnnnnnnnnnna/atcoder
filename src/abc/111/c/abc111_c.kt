fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val v = readLine()!!.split(' ').map { it.toInt() }
    val a = arrayOf(mutableMapOf<Int, Int>(), mutableMapOf<Int, Int>())
    val b = arrayOf(1, 1)
    val c = arrayOf(1, 1)
    val top = arrayOf(-1, -1)
    val s = mutableSetOf<Int>()
    for (i in 0 until n) {
        s.add(v[i])
        if(a[i%2][v[i]] ==  null) a[i%2][v[i]] = 1
        else {
            a[i%2][v[i]] = a[i%2][v[i]]!! + 1
            if (a[i%2][v[i]]!! >= b[i%2]) {
                top[i%2] = v[i]
                c[i%2] = b[i%2]
                b[i%2] = a[i%2][v[i]]!!
            }
        }
    }
    val need = n/2
    println(
        if (need-b[0] == 0 && need-b[1] == 0) {
            if (s.size == 1) need
            else 0
        } else {
            if (top[0] != top[1] || b[0] == c[0] || b[1] == c[1]) {
                need - b[0] + need - b[1]
            } else {
                Math.min(
                    need - b[0] + need - c[1],
                    need - c[0] + need - b[1]
                )
            }
        }
    )
}
