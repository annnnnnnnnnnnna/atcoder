package abc.`166`.e

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toLong() }

    var ans = 0L
    val gpI = mutableMapOf<Long,Long>()
    val gpJ = mutableMapOf<Long,Long>()
    for (i in 0 until n) {
        val plus = a[i]+i
        val minus = i-a[i]
        if (gpI[plus] != null) gpI[plus] = gpI[plus]!! + 1
        else gpI[plus] = 1
        if (gpJ[minus] != null) gpJ[minus] = gpJ[minus]!! + 1
        else gpJ[minus] = 1
    }

    gpI.forEach {
        if (gpJ[it.key] != null) {
            ans += it.value * gpJ[it.key]!!
        }
    }

    println(ans)

}
