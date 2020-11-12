package abc.`030`.c

fun main() {
    var (n, m) = readLine()!!.split(' ').map { it.toInt() }
    val (x, y) = readLine()!!.split(' ').map { it.toInt() }
    val a = readLine()!!.split(' ').map { it.toInt() }
    val b = readLine()!!.split(' ').map { it.toInt() }

    var ans = 0
    var t = 0
    var pos = 'A'
    var toB = 0
    var toA = 0
    while (true) {
        if (pos == 'A') {
            while (toB < n && a[toB] < t) {
                toB++
            }
            if (toB < n && a[toB] >= t) {
                ans++
                t = a[toB] + x
                pos = 'B'
            } else {
                break
            }
        } else {
            while (toA < m && b[toA] < t) {
                toA++
            }
            if (toA < m && b[toA] >= t) {
                ans++
                t = b[toA] + y
                pos = 'A'
            } else {
                break
            }
        }
    }

    println(ans/2)
}
