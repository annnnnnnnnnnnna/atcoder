package abc.`160`.c

fun main(args: Array<String>) {
    val (k, n) = readLine()!!.split(' ').map { it.toInt() }
    val a = readLine()!!.split(' ')

    var maxDist = 0
    var prev = 0
    repeat(n) {
        val aa = a[it].toInt()
        val dist = aa - prev
        prev = aa
        if (dist > maxDist) maxDist = dist
    }
    val finalDist = a[0].toInt() + k - a[n-1].toInt()
    if(finalDist > maxDist) maxDist = finalDist
    println(k - maxDist)
}
