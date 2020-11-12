package abc.`005`.c

fun main() {
    val t = readLine()!!.toInt()
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toInt() }
    val m = readLine()!!.toInt()
    val b = readLine()!!.split(' ').map { it.toInt() }

    if (n < m) {
        println("no")
        return
    }
    var tako = -1
    for (kyaku in 0 until m) {
        tako++
        while (a[tako] < b[kyaku] - t) {
            tako++
            if (tako == n) {
                println("no")
                return
            }
        }
        if (a[tako] > b[kyaku]) {
            println("no")
            return
        }
    }
    println("yes")
}
